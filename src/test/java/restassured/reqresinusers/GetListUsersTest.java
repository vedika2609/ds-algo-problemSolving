package restassured.reqresinusers;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

public class GetListUsersTest extends ReqresBaseTest {

    @DataProvider(name = "getUserListData")
    public Object[][] testdata() {
        return new Object[][]{
                {2, 200}
        };
    }

    @Test(testName = "getUserListTest", dataProvider = "getUserListData", alwaysRun = true)
    public void getUserListTest(int page, int statusCode) {
        String url = props.getProperty("envURL") + props.getProperty("createUser");
        params = new HashMap<String, Object>();
        gson = new Gson();
        responseValidations = new ResponseValidations();
        params.put("page", page);
        Response response = requestProcessor.getResponse(url, params);
        responseValidations.getUserListResponseValidation(response, page, statusCode);
    }

}
