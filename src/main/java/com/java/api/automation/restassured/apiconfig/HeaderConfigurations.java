package com.java.api.automation.restassured.apiconfig;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigurations {
	public Map<String, String> defaultHeaders(){
		Map<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-type", "application/json");
		
		return headerMap;
	}
}
