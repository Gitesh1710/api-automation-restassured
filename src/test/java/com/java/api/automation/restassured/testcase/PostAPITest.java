package com.java.api.automation.restassured.testcase;

import org.testng.annotations.Test;

import com.java.api.automation.restassured.apiconfig.APIEndPoints;
import com.java.api.automation.restassured.apiconfig.HeaderConfigurations;
import com.java.api.automation.restassured.basetest.BaseTest;
import com.java.api.automation.restassured.deserialization.ResponsePojo;
import com.java.api.automation.restassured.pojo.PostAPIPojo;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostAPITest extends BaseTest{
	@Test
	public void testPostAPI() {
		HeaderConfigurations objHeader = new HeaderConfigurations();
		/*
		 * PostAPIPojo objPostApi = new
		 * PostAPIPojo(1225,"Journey to the mind","No one");
		 * 
		 * Response response =
		 * RestAssured.given().when().headers(objHeader.defaultHeaders()).body(
		 * objPostApi).post(APIEndPoints.POST_USERS);
		 */		
		
		
		
		  Response response =
		  RestAssured.given().when().get(APIEndPoints.GET_LIST_OF_USERS);
		  System.out.println(response.asString());
		 		
		
		  ResponsePojo[] objResponse = response.as(ResponsePojo[].class);
		  for(ResponsePojo res : objResponse) {
			  System.out.println(res.getId());			  
		  }
	}
}
