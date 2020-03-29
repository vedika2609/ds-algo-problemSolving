package restassured.reqresinusers;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import java.util.Map;

class RequestProcessor {

    Response getResponse(String url, Map<String, Object> params) {
        Response response = RestAssured
                .given()
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

    Response postResponse(String url, Map<String, Object> params, String body) {
        Response response = RestAssured
                .given()
                .parameters(params)
                .body(body)
                .with()
                .contentType("application/json")
                .when()
                .post(url)
                .then()
                .extract()
                .response();
        return response;
    }
}
