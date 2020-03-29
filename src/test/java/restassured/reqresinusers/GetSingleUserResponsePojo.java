package restassured.reqresinusers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class GetSingleUserResponsePojo {

    private Data data;

    @Getter
    @Setter
    class Data {
        private String last_name;
        private String id;
        private String avatar;
        private String first_name;
        private String email;
    }
}
