//sudo json-server --watch db.json
package restassured;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import helpers.RequestProcessor;
import junit.framework.Assert;

public class PostTest {

	@DataProvider(name="PostData")
	public Object[][] testData() {
		return new Object[][]{
			{"TC_01", "2","Vedika", "Gupta"},
		};
	}
	@Test(dataProvider="PostData", alwaysRun = true,testName="Post") 
	public void testCaseInitialization(String testCaseID, final String idData, final String authorData, final String titleData) {

		LinkedHashMap<String,String> testData = new LinkedHashMap<String, String>() {
			{
				put("id", idData);
				put("author",authorData);
				put("title",titleData);
			}
		};
		RequestProcessor requestObject = new RequestProcessor();
		Response postResponse = requestObject.postRequest(testData);
		Assert.assertEquals(postResponse.getStatusCode(), 201);
		Response getResponse = requestObject.getRequest(testData, idData);
		Assert.assertEquals(getResponse.getStatusCode(), 200);
		Assert.assertEquals(postResponse.asString(), getResponse.asString());
	}
}
