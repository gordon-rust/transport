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
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;
    private List<Address> addresses;
    private List<Container> containers;

    public Trailer(){
    }

    public Trailer(String barcode, String barcodeFormat, Date scannedDate, List<Address> addresses, List<Container> containers) {
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
