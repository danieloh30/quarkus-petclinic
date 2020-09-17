package org.acme.rest;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import org.acme.service.VetsService;

@Path("vets")
public class VetsResource {

    @Inject
    VetsService service;

    @Inject
    Template vets;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {

        Map<String, Object> contents = new HashMap<>();
        contents.put("active", "vets");
        contents.put("vets", service.getAll());
        return vets.data("contents", contents);

    }
}