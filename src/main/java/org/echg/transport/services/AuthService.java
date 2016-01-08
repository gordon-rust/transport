package org.echg.transport.services;

import org.echg.transport.model.Authorization;

import java.nio.charset.Charset;
import java.util.Base64;


/**
 * Created by examiner on 12/31/15.
 */
public class AuthService {

    public Authorization authorizeUser(String username, String password){

        Authorization auth = new Authorization();
        auth.setUsername(username);
        auth.setPassword(password);

        if(username.equals("jstarustka") && password.equals("mypassword")){
            auth.setAuthorized(true);
        }
        else {
            auth.setAuthorized(false);
        }

        return auth;
    }

    private String base64Decode(String token){
        byte[] decodedBytes = Base64.getDecoder().decode(token);
        return new String(decodedBytes, Charset.forName("UTF-8"));
    }

}
