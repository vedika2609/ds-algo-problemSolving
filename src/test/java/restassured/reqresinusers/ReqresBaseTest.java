package restassured.reqresinusers;

import com.google.gson.Gson;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class ReqresBaseTest {
    static Properties props = null;
    RequestProcessor requestProcessor = new RequestProcessor();
    Gson gson = null;
    Map<String, Object> params = null;
    ResponseValidations responseValidations = null;

    @BeforeClass
    public void setup() throws Exception {
        InputStream ins = new FileInputStream(new File("src/test/java/restassured/meesho/config.properties"));
        props = new Properties();
        props.load(ins);
    }
}
