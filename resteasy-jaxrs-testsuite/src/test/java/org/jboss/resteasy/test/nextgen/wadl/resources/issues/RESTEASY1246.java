package org.jboss.resteasy.test.nextgen.wadl.resources.issues;

import org.jboss.resteasy.test.nextgen.wadl.resources.jaxb.Customer;

import javax.ws.rs.*;

/**
 * Created by weli on 6/13/16.
 */
@Path("/issues/1246")
public class RESTEASY1246 {
    @Path("/provides1")
    @GET
    @Produces({"application/xml", "application/json"})
    public String multipleProvides1() {
        return null;
    }

    @Path("/provides2")
    @GET
    @Produces("application/xml,application/json")
    public String multipleProvides2() {
        return null;
    }

    @Path("/consumes1")
    @POST
    @Consumes({"application/xml", "application/json"})
    public String multipleConsumes1() {
        return null;
    }

    @Path("/consumes2")
    @POST
    @Consumes({"text/plain,text/html"})
    public String multipleConsumes2() {
        return null;
    }
}

