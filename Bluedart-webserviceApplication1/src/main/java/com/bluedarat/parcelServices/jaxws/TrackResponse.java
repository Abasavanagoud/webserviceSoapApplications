
package com.bluedarat.parcelServices.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "trackResponse", namespace = "https://www.bluedart.com/ParcelTracking/service")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackResponse", namespace = "https://www.bluedart.com/ParcelTracking/service")
public class TrackResponse {

    @XmlElement(name = "track-status", namespace = "https://www.bluedart.com/ParcelTracking/types")
    private String trackStatus;

    /**
     * 
     * @return
     *     returns String
     */
    public String getTrackStatus() {
        return this.trackStatus;
    }

    /**
     * 
     * @param trackStatus
     *     the value for the trackStatus property
     */
    public void setTrackStatus(String trackStatus) {
        this.trackStatus = trackStatus;
    }

}
