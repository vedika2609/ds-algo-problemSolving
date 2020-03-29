package restassured.openweather;

import com.jayway.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Call16DayTest {

    static Properties props = null;

    @BeforeClass
    public void setup() throws Exception {
        InputStream ins = new FileInputStream(new File("src/test/java/restassured/openweather/url.properties"));
        props = new Properties();
        props.load(ins);
    }

    @DataProvider(name = "CallByCityNameData")
    public Object[][] testdata() {
        return new Object[][]{
                {"Altstadt", "DE", 1},
        };
    }

    @Test(testName = "CallByCityNameTest", dataProvider = "CallByCityNameData", alwaysRun = true)
    public void callByCityNameTest(String city, String country, int count) {
        RequestProcessor requestProcessor = new RequestProcessor();
        String url = props.getProperty("envURL") + props.getProperty("callByCityName");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("q", city + "," + country);
        params.put("cnt", count);

        Response response = requestProcessor.getResponse(url, params);

    }
}
