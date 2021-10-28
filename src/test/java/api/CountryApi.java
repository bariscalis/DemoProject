package api;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CountryApi extends TestBase {
    /*
    HEADER
        status code 200
        Server: cloudflare
        CF-Cache-Status: DYNAMIC
        Connection: keep-alive
    BODY
        has languages key
     */

    @Test
    public void testCountry(){
        //Expected Data
        Map<String, String> expectedHeader = new HashMap<>();
        expectedHeader.put("Server","Apache/2.4.38 (Debian)");
        expectedHeader.put("Connection", "Keep-Alive");

        Map<String, String> expectedData = new HashMap<>();
        expectedData.put("OneOfCountry","Finland");
        expectedData.put( "OneOfRegion", "Africa");
        expectedData.put("OneOfSubRegion", "South-Eastern Asia");

        // Send Request
        Response response = given()
                                .spec(spec02)
                            .when()
                                .get();
        // Response header details Hard Assertion
        response.then()
                    .assertThat()
                    .statusCode(200)
                    .headers(expectedHeader)
                    .body("name[219]", Matchers.hasToString("Switzerland"),
                         "region[162]", Matchers.hasToString("Africa"),
                         "alpha3Code", Matchers.hasItem("JPN"),
                         "languages.name", Matchers.hasItem(Arrays.asList("English")),
                            "find{it.name=='Japan'}.capital", Matchers.equalTo("Tokyo")
                         );


        List<String> allCountry = response.path("name");
        List<String> allSubregionDistinct = response.path("subregion.toUnique()");
        List<String> regionOfAStartCountry = response.path("findAll{it.name.startsWith('A')}.subregion");
        List<String> borderToCountry = response.path("findAll{'PAK' in it.borders}.name");
        List<String> regionsOfCountry = response.path("findAll{it.region=='Asia' & it.subregion=='Southern Asia'}.name");
        List<String> swedishLanguage = response.path("findAll{it.languages.findAll{it.name=='Swedish'}}.name");
        List<String> populationOver100B = response.path("findAll{it.population > 100000000}.name");

        Map<String,Object> groupByLanguage = response.path("groupBy{it.languages.name}");
        Map<String,Object> groupByCountryViaLanguage = response.path("groupBy{it.languages.name}.collectEntries{key,value -> [key, value.name]}");
        Map<String,Object> groupByCountryViaRegion = response.path("groupBy{it.region}.collectEntries{key,value -> [key, value.name]}");
        Map<String,Object> maxPopulationCountryAllInfo = response.path("max{it.population}");

        int hasMaxPopulationCountryPopulation = response.path("max{it.population}.population");
        String hasMaxPopulationCountryCapital = response.path("max{it.population}.capital");
        String hasMaxPopulationCountryCountry = response.path("max{it.population}.name");

        //System.out.println(hasMaxPopulationCountryCapital);

        //Soft Assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(allCountry.contains(expectedData.get("OneOfCountry")));
        softAssert.assertTrue(allSubregionDistinct.contains(expectedData.get("OneOfSubRegion")));
        softAssert.assertAll();

    }

}
