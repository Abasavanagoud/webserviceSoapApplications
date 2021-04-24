package com.bluedarat.parcelServices;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bluedarat.parcelServices.ParcelTracking",serviceName = "ParcelTrackingService" , portName = "ParcelTrackingPort")
public class ParcelTrackingImpl {
	public String track(String awbNo,String mobileNo) {
		return "in-transient";
		
	}
}
