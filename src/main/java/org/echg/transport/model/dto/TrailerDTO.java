package org.echg.transport.model.dto;

import org.echg.transport.model.pojo.Address;
import org.echg.transport.model.pojo.Container;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by examiner on 2/26/16.
 */
@Entity
@Table(name="TRAILER")
public class TrailerDTO {
    private int trailerID;
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;
    private boolean status;
    private ArrayList<Address> addresses;
    private ArrayList<Container> containerList;

    @Id
    @Column(name="TRAILER_ID")
    public int getTrailerID() {
        return trailerID;
    }

    public void setTrailerID(int trailerID) {
        this.trailerID = trailerID;
    }

    @Column(name="BARCODE")
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Column(name="BARCODE_FORMAT")
    public String getBarcodeFormat() {
        return barcodeFormat;
    }

    public void setBarcodeFormat(String barcodeFormat) {
        this.barcodeFormat = barcodeFormat;
    }

    @Column(name="SCANNED_DATE")
    public Date getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(Date scannedDate) {
        this.scannedDate = scannedDate;
    }

    @Column(name="STATUS")
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @OneToMany(fetch=FetchType.LAZY)
    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    @OneToMany(fetch=FetchType.LAZY)
    public ArrayList<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(ArrayList<Container> containerList) {
        this.containerList = containerList;
    }
}
