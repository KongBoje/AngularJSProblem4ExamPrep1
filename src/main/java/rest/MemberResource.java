/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.DataFactory;

/**
 * REST Web Service
 *
 * @author xboxm
 */
@Path("member")
public class MemberResource {

    @Context
    private UriInfo context;
    private DataFactory df;

    /**
     * Creates a new instance of MemberResource
     */
    public MemberResource() {
        df = new DataFactory();
    }

    @GET
    public String getGreeting() {
        return "Hello from member, have swell day mate!";
    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllMembers() {
        return df.getMembersAsJson();
    }
}
