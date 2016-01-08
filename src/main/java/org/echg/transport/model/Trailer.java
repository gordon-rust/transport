package org.echg.transport.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by examiner on 1/4/16.
 */
@XmlRootElement
public class Trailer {
    private String trailerCode;
    private Date depDateTime;
    private long latitude;
    private long longitude;
    private ArrayList<Container> containerList;

    public Trailer(){
    }

    public Trailer(String trailerCode, Date depDateTime, long latitude, long longitude, ArrayList<Container> containerList) {
        this.trailerCode = trailerCode;
        this.depDateTime = depDateTime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.containerList = containerList;
    }

    public String getTrailerCode() {
        return trailerCode;
    }

    public void setTrailerCode(String trailerCode) {
        this.trailerCode = trailerCode;
    }

    public Date getDepDateTime() {
        return depDateTime;
    }

    public void setDepDateTime(Date depDateTime) {
        this.depDateTime = depDateTime;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(ArrayList<Container> containerList) {
        this.containerList = containerList;
    }
}
