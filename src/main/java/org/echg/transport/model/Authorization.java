package org.echg.transport.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by examiner on 1/4/16.
 */

@XmlRootElement
public class Authorization {
    private boolean authorized;
    private String username;
    private String password;

    public Authorization(){

    }

    public Authorization(boolean authorized, String username, String password) {
        this.authorized = authorized;
        this.username = username;
        this.password = password;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
