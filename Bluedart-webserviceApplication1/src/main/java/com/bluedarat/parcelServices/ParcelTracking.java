package com.bluedarat.parcelServices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "ParcelTracking", targetNamespace = "https://www.bluedart.com/ParcelTracking/service")
public interface ParcelTracking {
	@WebResult(name = "track-status", targetNamespace = "https://www.bluedart.com/ParcelTracking/types")
	@WebMethod
	public String track(
			@WebParam(name = "awb-No", targetNamespace = "https://www.bluedart.com/ParcelTracking/types") String awbNo,
			@WebParam(name = "mobile-No", targetNamespace = "https://www.bluedart.com/ParcelTracking/types") String mobileNo);
//djdj
}
