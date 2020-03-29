package restassured.openweather;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;

class ResponseValidation {

    private static Response response;
    private Gson gson = null;

    public void callByCityNameValidation(Response response) {
        ResponseValidation.response = response;
        gson = new Gson();
        CallByCityNameResponsePojo callByCityNameResponse = gson.fromJson(response.asString(), CallByCityNameResponsePojo.class);

        //all assertions will follow here
    }
}
