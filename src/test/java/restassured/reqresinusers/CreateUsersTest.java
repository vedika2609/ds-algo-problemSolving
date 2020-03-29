package restassured.reqresinusers;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

public class CreateUsersTest extends ReqresBaseTest {

    @DataProvider(name = "createUserData")
    public Object[][] testdata() {
        return new Object[][]{
                {"Hrithik", "Actor", 201},
                {"Virat", "Cricketer", 201}
        };
    }

    @Test(testName = "createUserTest", dataProvider = "createUserData", alwaysRun = true)
    public void createUserTest(String name, String job, int statusCode) {
        String url = props.getProperty("envURL") + props.getProperty("createUser");
        params = new HashMap<>();
        gson = new Gson();
        responseValidations = new ResponseValidations();
        CreateUserRequestPojo requestPojo = new CreateUserRequestPojo();
        requestPojo.setName(name);
        requestPojo.setJob(job);
        String request = gson.toJson(requestPojo);
        Response response = requestProcessor.postResponse(url, params, request);
        responseValidations.createUserResponseValidation(response, name, job, statusCode);
        Response getResponse = requestProcessor.getResponse(props.getProperty("envURL") + String.format(props.getProperty("getSingleUser"), responseValidations.getId()), params);
        responseValidations.getUserResponseValidation(getResponse, name);
    }
}
