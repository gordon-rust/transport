package org.echg.transport.model;

/**
 * Created by examiner on 2/25/16.
 */
public class Address {
    private String feature;
    private String thoroughfare;
    private String locality;
    private String admin;
    private String postal;
    private double latitude;
    private double longitude;

    public Address() {
    }

    public Address(String feature, String thoroughfare, String locality, String admin, String postal, double latitude, double longitude) {
        this.feature = feature;
        this.thoroughfare = thoroughfare;
        this.locality = locality;
        this.admin = admin;
        this.postal = postal;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getThoroughfare() {
        return thoroughfare;
    }

    public void setThoroughfare(String thoroughfare) {
        this.thoroughfare = thoroughfare;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
