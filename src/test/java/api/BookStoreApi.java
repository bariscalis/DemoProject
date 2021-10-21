package api;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.HashMap;
import java.util.Map;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BookStoreApi extends TestBase {
    @Test
    public void test01(){
        //Set the URI
        spec03.pathParams("search", "search", "keyword","java");

        //Expected Data
        Map<String, String> expectedHeaderData = new HashMap<>();
        expectedHeaderData.put("server","cloudflare");
        expectedHeaderData.put("content-type","application/json");
        expectedHeaderData.put("content-encoding","gzip");
        expectedHeaderData.put("Connection","keep-alive");

        Map<String, String> expectedBodyData = new HashMap<>();
        expectedBodyData.put("title","Pro Java ME Apps");
        expectedBodyData.put("price","$36.22");
        expectedBodyData.put("isbn13","9780672337949");

        //Hard Assertion
        Response response = given()
                                .spec(spec03)
                            .when()
                                .get("/{search}/{keyword}")
                            .then()
                                .assertThat()
                                .headers(expectedHeaderData)
                                .body("books[0].title", Matchers.hasToString("Effective JavaScript"),
                                        "books.find{it.title=='Learning JavaScript'}.price", Matchers.hasToString("$8.99"))
                                .extract()
                                .response();
        //Soft Assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(response.asString().contains(expectedBodyData.get("title")));
        softAssert.assertTrue(response.asString().contains(expectedBodyData.get("price")));
        softAssert.assertEquals(response.path("books.find{it.title=='Sams Teach Yourself Java in 24 Hours, 8th Edition'}.isbn13"), expectedBodyData.get("isbn13"));
        softAssert.assertAll();

    }
}
