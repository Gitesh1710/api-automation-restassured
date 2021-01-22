package com.java.api.automation.restassured.basetest;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import com.java.api.automation.restassured.util.ApplicationUtil;

import io.restassured.RestAssured;

public class BaseTest {
	@BeforeTest
	public void setUp() {
		try {
			RestAssured.baseURI= ApplicationUtil.getProperty().getProperty("server-url");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
