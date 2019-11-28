package apiAutomation.TrelloAPI;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

@SuppressWarnings("unused")
public class putRequest extends PostRequest
{
	@SuppressWarnings("unchecked")
	public void updateList()
	{
	RequestSpecification request =RestAssured.given();
	request.header("Content-type", "application/json");
	JSONObject json= new JSONObject();
	json.put("name","PET");
	json.put("key", key);
	json.put("token", token);
	request.body(json.toString());
	Response response=request.put(url+"list/"+listid2);
	int code = response.getStatusCode();
	assertEquals(code, 200);
	}
	@SuppressWarnings("unchecked")
	public void updateCard()
	{
	RequestSpecification request =RestAssured.given();
	request.header("Content-type", "application/json");
	JSONObject json= new JSONObject();
	json.put("name","HERBIVORES");
	json.put("key", key);
	json.put("token", token);
	request.body(json.toString());
	Response response=request.put(url+"cards/{id}/", cardid2);
	int code = response.getStatusCode();
	assertEquals(code, 200);
	}
	@SuppressWarnings("unchecked")
	public void updateLabel()
	{
	RequestSpecification request =RestAssured.given();
	request.header("Content-type", "application/json");
	JSONObject json= new JSONObject();
	json.put("name","COW");
	json.put("key", key);
	json.put("token", token);
	request.body(json.toString());
	Response response=request.put(url+"labels/{id}/", labelid2);
	System.out.println(cardid1);
	System.out.println(cardid2);
	System.out.println(labelid1);
	System.out.println(labelid2);
	int code = response.getStatusCode();
	assertEquals(code, 200);
	}
	
}
