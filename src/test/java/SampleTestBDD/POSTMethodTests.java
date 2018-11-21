package SampleTestBDD;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POSTMethodTests {
	
	@BeforeMethod
	public void setUp() {
		
		RestAssured.baseURI = "{HOST}";
		
	}
	
	
	//@Test
	public void cretePost() {
		
	given().
		header("Authorization", "{auth-token}").
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
	    post("{API}").andReturn().
	
	then().
	assertThat().
	log().all().
	statusCode(200);	
		
	}
	
	
	@Test
	public void creteFeedComment() {
		
	given().
	        
	        header("Authorization", "{auth-token}"). 
	        body("{MESSAGE}"). 
	        
	when().
	        post("{API}").
	        
	then().
	        statusCode(200).
	        and().
	        log().all();
	        
		
	}
	
	
	
	
	
	
	

}
