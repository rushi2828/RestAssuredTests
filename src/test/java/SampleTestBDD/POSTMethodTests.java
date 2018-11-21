package SampleTestBDD;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POSTMethodTests {
	
	@BeforeMethod
	public void setUp() {
		
		RestAssured.baseURI = "https://devapi.healthpole.com";
		
	}
	
	
	//@Test
	public void cretePost() {
		
	given().
		header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjo1fQ.7XazkQhbiuDALP8c_WGjNFjQEjUlMq-LJWO3LxvhmiU").
		body("{\n" + 
				"	\"type\": \"POST\",\n" + 
				"	\"title\": \"discussion B\",\n" + 
				"	\"description\": \"This is creted test\",\n" + 
				"	\"body\": {\n" + 
				"		\"key\": \"what ever inside body, will be stored as it is\",\n" + 
				"		\"key_two\": {\n" + 
				"			\"key_three\": \"three\",\n" + 
				"			\"key_four\": {\n" + 
				"				\"key_five\": \"five\"\n" + 
				"			}\n" + 
				"		}\n" + 
				"	},\n" + 
				"	\"imagesCount\": 3\n" + 
				"}").
		
	when().
	    post("/api/v1/doctors/feeds").andReturn().
	
	then().
	assertThat().
	log().all().
	statusCode(200);	
		
	}
	
	
	@Test
	public void creteFeedComment() {
		
	given().
	        
	        header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjo1fQ.7XazkQhbiuDALP8c_WGjNFjQEjUlMq-LJWO3LxvhmiU"). 
	        body("{\"isLiked\":false,\"message\":{\"senderType\":0,\"text\":\"Hello\"}}"). 
	        
	when().
	        post("/api/v1/doctors/feeds/4682/comments").
	        
	then().
	        statusCode(200).
	        and().
	        log().all();
	        
		
	}
	
	
	
	
	
	
	

}
