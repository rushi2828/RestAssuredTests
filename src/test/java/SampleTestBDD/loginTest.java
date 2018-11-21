package SampleTestBDD;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class loginTest {
	
	
	@BeforeMethod
	public void setUp() {
		
		RestAssured.baseURI = "https://devapi.healthpole.com";
		
	}
	
	
	@Test
	public void loginTest1 (){
		
		given().
		param("email", "rushikesh.m@bootinfotech.com").
		param("password", "test1234").
		param("Content-Type", "application/json").


	
	when().
	post("/api/v1/doctors/login").
	
	then().
	assertThat().
	log().all().
	statusCode(200);
	
	}
	
	



}
