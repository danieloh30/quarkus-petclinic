package org.acme.rest;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import org.acme.service.OwnersService;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@Path("/")
public class OwnersResource {

    @Inject
    OwnersService service;

    @Inject
    Template owners;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("owners")
    public TemplateInstance get() {

        Map<String, Object> contents = new HashMap<>();
        contents.put("active", "owners");
        return owners.data("contents", contents);

    }

    @GET
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    @Path("find")
    public TemplateInstance findByLastName(@QueryParam("lastName") String lastName) {

        Map<String, Object> contents = new HashMap<>();
        contents.put("active", "owners");
        contents.put("lastName", lastName);
        contents.put("owners", service.findByLastName(lastName));
        return owners.data("contents", contents);

    }

}