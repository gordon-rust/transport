package org.echg.transport.model.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by examiner on 1/4/16.
 */
@XmlRootElement
public class Trailer {
    private int trailerID;
    private String barcode;
    private String barcodeFormat;
    private Date scannedPickupDate;
    private Date scannedDropoffDate;
    private List<Address> addresses;
    private List<Container> containers;

    public Trailer(){
    }

    public Trailer(int trailerID, String barcode, String barcodeFormat, Date scannedPickupDate, Date scannedDropoffDate, List<Address> addresses, List<Container> containers) {
        this.trailerID = trailerID;
        this.barcode = barcode;
        this.barcodeFormat = barcodeFormat;
        this.scannedPickupDate = scannedPickupDate;
        this.scannedDropoffDate = scannedDropoffDate;
        this.addresses = addresses;
        this.containers = containers;
    }

    public int getTrailerID() {
        return trailerID;
    }

    public void setTrailerID(int trailerID) {
        this.trailerID = trailerID;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBarcodeFormat() {
        return barcodeFormat;
    }

    public void setBarcodeFormat(String barcodeFormat) {
        this.barcodeFormat = barcodeFormat;
    }

    public Date getScannedPickupDate() {
        return scannedPickupDate;
    }

    public void setScannedPickupDate(Date scannedPickupDate) {
        this.scannedPickupDate = scannedPickupDate;
    }

    public Date getScannedDropoffDate() {
        return scannedDropoffDate;
    }

    public void setScannedDropoffDate(Date scannedDropoffDate) {
        this.scannedDropoffDate = scannedDropoffDate;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }
}
