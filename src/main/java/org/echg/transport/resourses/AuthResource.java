package org.echg.transport.resourses;

import org.echg.transport.model.Authorization;
import org.echg.transport.services.AuthService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by examiner on 12/31/15.
 */
@Path("auth")
@Produces(MediaType.APPLICATION_JSON)
public class AuthResource {

    private AuthService as = new AuthService();

    @GET
    public Authorization getAuth(@QueryParam("username")String username,@QueryParam("password") String password) {

        System.out.println(username);
        return as.authorizeUser(username,password);
    }
}
