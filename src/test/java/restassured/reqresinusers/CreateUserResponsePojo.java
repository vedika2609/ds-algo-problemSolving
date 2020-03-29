package restassured.reqresinusers;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateUserResponsePojo {

    private Date createdAt;
    private String name;
    private String id;
    private String job;

}
