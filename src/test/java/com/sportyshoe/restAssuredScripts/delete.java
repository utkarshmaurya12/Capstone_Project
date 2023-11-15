package com.sportyshoe.restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class delete {
	
	@Test(priority='1')
	public void delete_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020")
		.when().delete()
		.then().log().all();
		
	}
	
}
