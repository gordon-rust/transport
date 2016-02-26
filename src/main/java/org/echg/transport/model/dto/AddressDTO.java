package org.echg.transport.model.dto;

import javax.persistence.*;

/**
 * Created by examiner on 2/26/16.
 */
@Entity
@Table(name="TRAILER")
public class AddressDTO {
    private int addressID;
    private String feature;
    private String thoroughfare;
    private String locality;
    private String admin;
    private String postal;
    private double latitude;
    private double longitude;
    private int trailerID;

    @Id
    @Column(name="ADDRESS_ID")
    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    @Column(name="FEATURE")
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Column(name="THOROUGHFARE")
    public String getThoroughfare() {
        return thoroughfare;
    }

    public void setThoroughfare(String thoroughfare) {
        this.thoroughfare = thoroughfare;
    }

    @Column(name="LOCALITY")
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Column(name="ADMIN")
    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Column(name="POSTAL")
    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Column(name="LATITUDE")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Column(name="LONGITUDE")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @ManyToOne
    public int getTrailerID() {
        return trailerID;
    }

    public void setTrailerID(int trailerID) {
        this.trailerID = trailerID;
    }
}
