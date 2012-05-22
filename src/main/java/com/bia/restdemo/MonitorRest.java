package com.bia.restdemo;

/**
 *
 * @author intesar
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

// The Java class will be hosted at the URI path "/rest/monitor"
@Path("/monitor")
public class MonitorRest {


    // curl -i -X POST -H 'Content-Type: application/json' -d 'url=http://www.google.com&email=intesar@ymail.com' http://localhost:8080/rest/monitor/
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON})
    public String post(@FormParam("url") String url, @FormParam("email") String email) {
        
        return "";
        //return "Please check your email!";
    }

    

    // curl -i -X GET http://localhost:8080/rest/monitor/status/34343
    //http://localhost:8080/rest/monitor/status/123
    @GET
    @Path("/status/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public String status(@PathParam("id") String id) {
        return "{id:" + id +"}";
    }
}
