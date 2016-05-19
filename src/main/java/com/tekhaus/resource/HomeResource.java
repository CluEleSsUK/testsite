package com.tekhaus.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HomeResource {

    @GET
    public Response homepage() {
        return Response.ok("hello world").build();
    }
}
