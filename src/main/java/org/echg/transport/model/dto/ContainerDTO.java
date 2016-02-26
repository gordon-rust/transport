package org.echg.transport.model.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by examiner on 2/26/16.
 */
@Entity
@Table(name="CONTAINER")
public class ContainerDTO {
    private int containerID;
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;
    private int trailerID;

    @Id
    @Column(name="CONTAINER_ID")
    public int getContainerID() {
        return containerID;
    }

    public void setContainerID(int containerID) {
        this.containerID = containerID;
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

    @ManyToOne
    public int getTrailerID() {
        return trailerID;
    }

    public void setTrailerID(int trailerID) {
        this.trailerID = trailerID;
    }
}
