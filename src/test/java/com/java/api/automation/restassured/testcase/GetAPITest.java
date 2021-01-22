package com.java.api.automation.restassured.testcase;

import org.testng.annotations.Test;

import com.java.api.automation.restassured.apiconfig.APIEndPoints;
import com.java.api.automation.restassured.basetest.BaseTest;
import com.java.api.automation.restassured.validation.APIValidations;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetAPITest extends BaseTest{
	@Test
	public void GetAPITest() {
		Response response = RestAssured.given().when().get(APIEndPoints.GET_LIST_OF_USERS);
		APIValidations.validateResponseCode(response, "200");

		APIValidations.validateResponseTime(response, 4);

		APIValidations.validateValueInResponse(response, "author");
	}
}
