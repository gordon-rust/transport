package org.echg.transport.model;

import java.util.Date;

/**
 * Created by examiner on 1/4/16.
 */
public class Container {
    private String code;
    private Date scanned;

    public Container(){

    }

    public Container(String code, Date scanned) {
        this.code = code;
        this.scanned = scanned;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getScanned() {
        return scanned;
    }

    public void setScanned(Date scanned) {
        this.scanned = scanned;
    }
}
