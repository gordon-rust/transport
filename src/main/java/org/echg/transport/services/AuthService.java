package org.echg.transport.services;

import org.echg.transport.model.Authorization;

import java.nio.charset.Charset;
import java.util.Base64;


/**
 * Created by examiner on 12/31/15.
 */
public class AuthService {

    public Authorization authorizeUser(Authorization auth){

        System.out.println(auth.getUsername() + " " + auth.getPassword());
        return auth;
    }

    private String base64Decode(String token){
        byte[] decodedBytes = Base64.getDecoder().decode(token);
        return new String(decodedBytes, Charset.forName("UTF-8"));
    }

}
