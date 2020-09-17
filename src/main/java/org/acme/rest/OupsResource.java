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

@Path("oups")
public class OupsResource {

    @Inject
    Template oups;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {

        Map<String, Object> contents = new HashMap<>();
        contents.put("active", "oups");
        contents.put("message", "Expected: controller used to showcase what " + "happens when an exception is thrown");
        return oups.data("contents", contents);

    }
    
}