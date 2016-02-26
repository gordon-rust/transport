package org.echg.transport.model.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by examiner on 1/4/16.
 */

@XmlRootElement
public class Authorization {
    private String username;
    private String password;

    public Authorization(){

    }

    public Authorization(String username, String password) {
        this.username = username;
        this.password = password;
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
