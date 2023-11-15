package com.sportyshoe.restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class Get_AllShoes {

	@Test(priority='1')
	public void Get_all_shoes()
	{
		RestAssured
		.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when().get()
		.then()
		.statusCode(200) // this method validate if the response status code is 200 or not
		.log().all();
		
		
	}
	
	
	@Test(priority='2')
	public void get_all_users()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();
		
	}
}
