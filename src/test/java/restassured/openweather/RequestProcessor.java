package restassured.openweather;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import java.util.Map;

class RequestProcessor {

    private final static String APPID = "b8154d83c96b1156880bef63873fc51b";

    Response getResponse(String url, Map<String, Object> params) {
        Response response = RestAssured
                .given()
                .parameter("appid", APPID)
                .parameters(params)
                .with()
                .contentType("application/json")
                .when()
                .get(url)
                .then()
                .extract()
                .response();
        return response;
    }
}
