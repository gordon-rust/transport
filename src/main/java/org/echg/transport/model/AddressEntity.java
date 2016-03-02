package org.echg.transport.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by examiner on 3/2/16.
 */
@Entity
@Table(name = "Address", schema = "transport", catalog = "examiner")
public class AddressEntity implements Serializable {
    private int addressId;
    private String feature;
    private String thoroughfare;
    private String locality;
    private String admin;
    private String postal;
    private Double latitude;
    private Double longitude;

    @Id
    @Column(name = "ADDRESS_ID")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "FEATURE")
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Basic
    @Column(name = "THOROUGHFARE")
    public String getThoroughfare() {
        return thoroughfare;
    }

    public void setThoroughfare(String thoroughfare) {
        this.thoroughfare = thoroughfare;
    }

    @Basic
    @Column(name = "LOCALITY")
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Basic
    @Column(name = "ADMIN")
    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Basic
    @Column(name = "POSTAL")
    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Basic
    @Column(name = "LATITUDE")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "LONGITUDE")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
