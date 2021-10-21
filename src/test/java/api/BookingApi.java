package api;

import io.restassured.authentication.OAuthSignature;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import static org.junit.Assert.*;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BookingApi extends TestBase {
    /*
						 When
						    I send a GET request to REST API URL
						    https://restful-booker.herokuapp.com/booking/1001
					     Then
					        HTTP Status Code should be 404
					        And response body contains "Not Found"
					        And response body does not contain "JavaApi"
					        And header "Server" should be "Cowboy"
					        And header "Content-Type" should be "text/plain; charset=utf-8"
					        And header "Via" should be "1.1 vegur"

					        Note: For Base URL use spec02
					        Note: Use Map for expected values
					        Note: Use Hard Assertion and Soft Assertion
					*/

    @Test
    public void test01(){
        // Set the URI
        spec01.auth()
                .basic("admin", "password123")
                .pathParams("book", "booking", "id", 1001);

        // Set the expected Data
        List<String> abc = new ArrayList<>();

        Map<String,String> expectedData = new HashMap<>();
        expectedData.put("Server", "Cowboy");
        expectedData.put("Content-Type", "text/plain; charset=utf-8");
        expectedData.put("Via", "1.1 vegur");
        expectedData.put("trueBodyText", "Not Found");
        expectedData.put("wrongBodyText", "JavaApi");

        // First method for hard assertion
        Response response = given()
                                .spec(spec01)
                            .when()
                                .get("/{book}/{id}")
                            .then()
                                .assertThat()
                                .statusCode(404)
//                                .headers(expectedData)    //
                                .headers("Server", expectedData.get("Server"),
                                        "Content-Type", expectedData.get("Content-Type"),
                                        "Via", expectedData.get("Via")
                                        )
                                .body(Matchers.equalTo("Not Found"))
                                .extract()
                                .response();

        // Second Method for hard assertion
        assertTrue(response.asString().contains(expectedData.get("trueBodyText")));
        assertFalse(response.asString().contains(expectedData.get("wrongBodyText")));
        assertEquals(expectedData.get("Content-Type"), response.getHeader("Content-Type"));
        assertEquals(expectedData.get("Via"), response.getHeader("Via"));

        // Third method with soft assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getHeader("Server"), expectedData.get("Server"));
        softAssert.assertEquals(response.getHeader("Content-Type"), expectedData.get("Content-Type"));
        softAssert.assertEquals(response.getHeader("Via"), expectedData.get("Via"));
        softAssert.assertTrue(response.asString().contains(expectedData.get("trueBodyText")));
        softAssert.assertFalse(response.asString().contains(expectedData.get("wrongBodyText")));
        softAssert.assertAll();
    }
}
