package org.echg.transport.model.dto;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by examiner on 3/4/16.
 */
@XmlRootElement
@Entity
@Table(name = "container", schema = "transport", catalog = "examiner")
public class ContainerEntity implements Serializable {
    private Integer containerId;
    private String barcode;
    private String barcodeFormat;
    private Date scannedDate;
    private TrailerEntity trailer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "container_id")
    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    @Basic
    @Column(name = "barcode")
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Basic
    @Column(name = "barcode_format")
    public String getBarcodeFormat() {
        return barcodeFormat;
    }

    public void setBarcodeFormat(String barcodeFormat) {
        this.barcodeFormat = barcodeFormat;
    }

    @Basic
    @Column(name = "scanned_date")
    public Date getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(Date scannedDate) {
        this.scannedDate = scannedDate;
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
