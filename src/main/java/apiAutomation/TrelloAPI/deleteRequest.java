package apiAutomation.TrelloAPI;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class deleteRequest extends putRequest
{
@SuppressWarnings("unchecked")
public void deleteCard() 
{
	RequestSpecification request =RestAssured.given();
	request.header("Content-type", "application/json");
	JSONObject json= new JSONObject();
	json.put("key",key);
	json.put("token",token);
	request.body(json.toString());
	Response response=request.delete(url+"cards/"+cardid2);
	int code = response.getStatusCode();
	System.out.println(response.asString());
	assertEquals(code, 200);	   

}
}

