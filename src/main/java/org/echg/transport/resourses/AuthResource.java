package org.echg.transport.resourses;

import org.echg.transport.model.pojo.Authorization;
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

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Authorization getAuth(Authorization auth) {

        return as.authorizeUser(auth);
    }
}
