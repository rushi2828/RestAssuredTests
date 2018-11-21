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
		
		RestAssured.baseURI = "{HOST}";
		
	}
	
	
	@Test
	public void loginTest1 (){
		
		given().
		param("email", "r@gmail.com").
		param("password", "test").
		param("Content-Type", "application/json").


	
	when().
	post("{end points}").
	
	then().
	assertThat().
	log().all().
	statusCode(200);
	
	}
	
	



}
