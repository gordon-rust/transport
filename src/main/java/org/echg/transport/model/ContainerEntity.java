package org.echg.transport.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by examiner on 3/2/16.
 */
@Entity
@Table(name = "Container", schema = "transport", catalog = "examiner")
public class ContainerEntity implements Serializable {
    private int containerId;
    private String barcode;
    private String barcodeFormat;
    private Timestamp scannedDate;

    @Id
    @Column(name = "CONTAINER_ID")
    public int getContainerId() {
        return containerId;
    }

    public void setContainerId(int containerId) {
        this.containerId = containerId;
    }

    @Basic
    @Column(name = "BARCODE")
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Basic
    @Column(name = "BARCODE_FORMAT")
    public String getBarcodeFormat() {
        return barcodeFormat;
    }

    public void setBarcodeFormat(String barcodeFormat) {
        this.barcodeFormat = barcodeFormat;
    }

    @Basic
    @Column(name = "SCANNED_DATE")
    public Timestamp getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(Timestamp scannedDate) {
        this.scannedDate = scannedDate;
    }

}
