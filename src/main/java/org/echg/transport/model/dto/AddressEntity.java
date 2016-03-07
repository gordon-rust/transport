package org.echg.transport.model.dto;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by examiner on 3/4/16.
 */
@XmlRootElement
@Entity
@Table(name = "address", schema = "transport", catalog = "examiner")
public class AddressEntity implements Serializable{
    private Integer addressId;
    private String admin;
    private String feature;
    private String locality;
    private String postal;
    private String thoroughfare;
    private Double latitude;
    private Double longitude;
    private TrailerEntity trailer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "admin")
    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Basic
    @Column(name = "feature")
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Basic
    @Column(name = "locality")
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Basic
    @Column(name = "postal")
    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Basic
    @Column(name = "thoroughfare")
    public String getThoroughfare() {
        return thoroughfare;
    }

    public void setThoroughfare(String thoroughfare) {
        this.thoroughfare = thoroughfare;
    }

    @Basic
    @Column(name = "latitude")
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trailer_id")
    public TrailerEntity getTrailer() {
        return trailer;
    }

    public void setTrailer(TrailerEntity trailer) {
        this.trailer = trailer;
    }

}
