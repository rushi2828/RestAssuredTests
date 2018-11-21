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
		
		RestAssured.baseURI = "{HOST}";
		
	}
	
	
	@Test
		public void getNewsfeedData() {
			
		
		Response res =
		given().
			param("email", "{EMAIL_ID}").
			param("password", "{PASSWORD}").
			queryParam("page ", 1).
			header("Authorization", "{auth-token}").
			
		when().
			get("{API}").
			
		then().
		assertThat().
		contentType(ContentType.JSON).
		extract().response();
		
		System.out.println("Response is: "+res);

		
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
