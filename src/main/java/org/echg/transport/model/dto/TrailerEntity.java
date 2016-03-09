package org.echg.transport.model.dto;

import org.echg.transport.model.pojo.Address;
import org.echg.transport.model.pojo.Container;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.*;

/**
 * Created by examiner on 3/4/16.
 */
@Entity
@Table(name = "trailer", schema = "transport", catalog = "examiner")
public class TrailerEntity implements Serializable{
    private Integer trailerId;
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;
    private Set<AddressEntity> addresses;
    private Set<ContainerEntity> containers;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trailer_id", unique = true)
    public Integer getTrailerId() {
        return trailerId;
    }

    public void setTrailerId(Integer trailerId) {
        this.trailerId = trailerId;
    }

    @Column(name = "barcode")
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Column(name = "barcode_format")
    public String getBarcodeFormat() {
        return barcodeFormat;
    }

    public void setBarcodeFormat(String barcodeFormat) {
        this.barcodeFormat = barcodeFormat;
    }

    @Column(name = "scanned_date")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(Date scannedDate) {
        this.scannedDate = scannedDate;
    }

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "trailer")
    public Set<AddressEntity> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressEntity> addresses) {
        this.addresses = addresses;
    }

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "trailer")
    public Set<ContainerEntity> getContainers() {
        return containers;
    }

    public void setContainers(Set<ContainerEntity> containers) {
        this.containers = containers;
    }
}
