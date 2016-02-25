package org.echg.transport.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by examiner on 1/4/16.
 */
@XmlRootElement
public class Container {
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;

    public Container(){

    }

    public Container(String barcode, Date scannedDate) {
        this.barcode = barcode;
        this.scannedDate = scannedDate;
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
}
