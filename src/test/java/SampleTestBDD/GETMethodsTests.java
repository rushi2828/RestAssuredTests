package SampleTestBDD;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class GETMethodsTests {
	
	
	@BeforeMethod
	public void setUp() {
		
		RestAssured.baseURI = "https://devapi.healthpole.com";
		
	}
	
	
	@Test
		public void getNewsfeedData() {
			
		
		Response res =
		given().
			param("email", "rushikesh.m@bootinfotech.com").
			param("password", "test1234").
			queryParam("page ", 1).
			header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjo1fQ.7XazkQhbiuDALP8c_WGjNFjQEjUlMq-LJWO3LxvhmiU").
			
		when().
			get("/api/v1/doctors/feeds").
			
		then().
		assertThat().
		contentType(ContentType.JSON).
		extract().response();
		
		System.out.println("Response is: "+res);

		
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
