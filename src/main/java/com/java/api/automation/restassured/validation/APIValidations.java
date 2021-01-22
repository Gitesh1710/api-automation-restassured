package com.java.api.automation.restassured.validation;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIValidations {
	public static void validateResponseCode(Response response, String expectedCode) {
		Assert.assertEquals(response.getStatusCode(), Integer.parseInt(expectedCode));
	}
	
	public static void validateResponseTime(Response response, int expectedResponseTime) {
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS)<expectedResponseTime, "Response is too slow");
	}
	
	public static void validateValueInResponse(Response response, String node) {
		JsonPath jsonPath = new JsonPath(response.asString());
		System.out.println(jsonPath.get(node));
	}
}
