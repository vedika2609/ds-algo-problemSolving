package helpers;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import restassured.PostRequestPojo;

public class RequestProcessor {
	private HashMap<String, String> headers = null;
	private HashMap<String, String> parameters = null;

	public HashMap<String, String> getHeaders() {return headers;}
	public void setHeaders(HashMap<String, String> headers) {this.headers = headers;}
	public HashMap<String, String> getParameters() {return parameters;}
	public void setParameters(HashMap<String, String> parameters) {this.parameters = parameters;}

	public Response postRequest(LinkedHashMap<String, String>testData){
		PostRequestPojo post = new PostRequestPojo(testData);
		Response response = null;

		response = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.body(post)
				.when().post("http://localhost:3000/posts")
				.then()
				.extract()
				.response();
		return response;

	}

	public Response getRequest(LinkedHashMap<String, String>testData, String id){
		Response response = null;

		response = RestAssured
				.given()
				.contentType(ContentType.JSON)
				.when().get("http://localhost:3000/posts/"+ id)
				.then()
				.extract()
				.response();
		return response;

	}
}