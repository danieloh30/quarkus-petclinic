package org.acme.rest;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import org.acme.model.Owners;
import org.acme.service.OwnersService;
import org.acme.model.Pets;
import org.acme.model.PetForm;
import org.acme.model.PetType;
import org.acme.service.PetsService;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@Path("/")
public class PetsResource {

    @Inject
    OwnersService ownerService;

    @Inject
    PetsService petService;

    @Inject
    Template pet;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("getPet")
    public TemplateInstance getPet(@QueryParam("ownerId") Long ownerId, @QueryParam("petId") Long petId) {
        return pet.data("active", "owners")
                    .data("owner", ownerService.findById(ownerId))
                    .data("pet", (petId != null ? petService.findById(petId) : petId));
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Transactional
    @Path("addPet")
    public Response addPet(@MultipartForm PetForm petForm, @QueryParam("ownerId") Long ownerId) {

        Pets newPet = petForm.addPet();
        newPet.setOwners(ownerService.findById(ownerId));
        newPet.setPetType(PetType.findByName(petForm.type));
        newPet.persist();
        return Response.status(301)
                    .location(URI.create("/owners?id=" + ownerId))
                    .build();
    }


    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Transactional
    @Path("editPet")
    public Response editOwner(@MultipartForm PetForm petForm, @QueryParam("ownerId") Long ownerId, @QueryParam("petId")Long petId) {

        Pets existingPet = petService.findById(petId);
        existingPet = petForm.editPet(existingPet);
        existingPet.setOwners(ownerService.findById(ownerId));
        existingPet.setPetType(PetType.findByName(petForm.type));
        return Response.status(301)
            .location(URI.create("/owners?id=" + ownerId))
            .build();
    }

}