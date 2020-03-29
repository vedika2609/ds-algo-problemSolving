package restassured.reqresinusers;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import org.testng.Assert;

class ResponseValidations {
    Gson gson = null;
    private Response postResponse;
    private Response getSingleUserResponse;
    private Response getUserListResponse;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    void createUserResponseValidation(Response response, String name, String job, int statusCode) {
        this.postResponse = response;
        Assert.assertEquals(response.getStatusCode(), statusCode, "Request Failed: " + response.getStatusCode());
        if (statusCode == 201) {
            gson = new Gson();
            CreateUserResponsePojo responseObject = gson.fromJson(response.getBody().asString(), CreateUserResponsePojo.class);
            setId(responseObject.getId());
            Assert.assertEquals(responseObject.getName(), name, "Invalid name in created user id: " + getId());
            Assert.assertEquals(responseObject.getJob(), job, "Invalid job in created user id: " + getId());
        }
    }

    void getUserResponseValidation(Response getResponse, String name) {
        gson = new Gson();
        this.getSingleUserResponse = getResponse;
        GetSingleUserResponsePojo responseObject = gson.fromJson(getResponse.asString(), GetSingleUserResponsePojo.class);
        Assert.assertEquals(responseObject.getData().getFirst_name(), name, "Invalid name in getSingleUser response id: " + getId());
        Assert.assertEquals(responseObject.getData().getId(), name, "Invalid ID in getSingleUser response id: " + getId());
    }

    void getUserListResponseValidation(Response response, int page, int statusCode) {
        gson = new Gson();
        this.getUserListResponse = response;
        Assert.assertEquals(response.getStatusCode(), statusCode, "Request Failed: " + response.getStatusCode());
        if (statusCode == 200) {
            GetUsersListResponsePojo responseObject = gson.fromJson(response.asString(), GetUsersListResponsePojo.class);

            Assert.assertEquals(responseObject.getPage(), page);
            Assert.assertEquals(responseObject.getPer_page(), responseObject.getData().size());
            Assert.assertEquals(responseObject.getTotal(), responseObject.getPer_page() * responseObject.getTotal_pages());

            for (GetSingleUserResponsePojo.Data data : responseObject.getData()) {

                //each data should be asserted against the response of getSingleUser
            }
        }
    }

}
