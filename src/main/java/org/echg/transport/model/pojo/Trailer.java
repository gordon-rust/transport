package org.echg.transport.model.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 * Created by examiner on 1/4/16.
 */
@XmlRootElement
public class Trailer {
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;
    private Set<Address> addresses;
    private Set<Container> containers;

    public Trailer(){
    }

    public Trailer(String barcode, String barcodeFormat, Date scannedDate, Set<Address> addresses, Set<Container> containers) {
        this.barcode = barcode;
        this.barcodeFormat = barcodeFormat;
        this.scannedDate = scannedDate;
        this.addresses = addresses;
        this.containers = containers;
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

    public Date getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(Date scannedDate) {
        this.scannedDate = scannedDate;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Container> getContainers() {
        return containers;
    }

    public void setContainers(Set<Container> containers) {
        this.containers = containers;
    }
}
