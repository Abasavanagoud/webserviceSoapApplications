
package com.bluedarat.parcelServices.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "track", namespace = "https://www.bluedart.com/ParcelTracking/service")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "track", namespace = "https://www.bluedart.com/ParcelTracking/service", propOrder = {
    "awbNo",
    "mobileNo"
})
public class Track {

    @XmlElement(name = "awb-No", namespace = "https://www.bluedart.com/ParcelTracking/types")
    private String awbNo;
    @XmlElement(name = "mobile-No", namespace = "https://www.bluedart.com/ParcelTracking/types")
    private String mobileNo;

    /**
     * 
     * @return
     *     returns String
     */
    public String getAwbNo() {
        return this.awbNo;
    }

    /**
     * 
     * @param awbNo
     *     the value for the awbNo property
     */
    public void setAwbNo(String awbNo) {
        this.awbNo = awbNo;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getMobileNo() {
        return this.mobileNo;
    }

    /**
     * 
     * @param mobileNo
     *     the value for the mobileNo property
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}
