package org.echg.transport.model.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by examiner on 1/4/16.
 */
@XmlRootElement
public class Trailer {
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;
    private boolean status;
    private ArrayList<Address> addresses;
    private ArrayList<Container> containerList;

    public Trailer(){
    }

    public Trailer(String barcode, String barcodeFormat, Date scannedDate, boolean status, ArrayList<Address> addresses, ArrayList<Container> containerList) {
        this.barcode = barcode;
        this.barcodeFormat = barcodeFormat;
        this.scannedDate = scannedDate;
        this.status = status;
        this.addresses = addresses;
        this.containerList = containerList;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public ArrayList<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(ArrayList<Container> containerList) {
        this.containerList = containerList;
    }
}
