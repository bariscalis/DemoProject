package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import pojo.Country;
import utilities.TestBase;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class CountryApiViaPojo extends TestBase {
    /*
    HEADER
        status code 200
        Server: cloudflare
        CF-Cache-Status: DYNAMIC
        Connection: keep-alive
    BODY
        has languages key
     */

    Response response;
    Country[] country;

    @Test
    public void testCountry() throws IOException {
        //Expected Data
        Map<String, String> expectedData = new HashMap<>();
        expectedData.put("OneOfSwedishLanguageCountry","Finland");
        expectedData.put( "OneOfCountryPopulationBiggerThen50M", "Japan");
        expectedData.put("OneOfSubRegion", "South-Eastern Asia");

        // Send Request
        response =  given()
                        .spec(spec02)
                    .when()
                        .get();
/*
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

        List<String> allSubregionDistinct = response.path("subregion.toUnique()");
        List<String> regionOfAStartCountry = response.path("findAll{it.name.startsWith('A')}.subregion");
        List<String> borderToCountry = response.path("findAll{it.borders.contains('PAK')}.name");
        List<String> regionsOfCountry = response.path("findAll{it.region=='Asia'&it.subregion=='Southern Asia'}.name");
        List<String> swedishLanguage = response.path("findAll{it.languages.findAll{it.name=='Swedish'}}.name");
        List<String> populationOver100B = response.path("findAll{it.population > 100000000}.name");

        Map<String,Object> groupByLanguage = response.path("groupBy{it.languages.name}");
        Map<String,Object> groupByCountryViaLanguage = response.path("groupBy{it.languages.name}.collectEntries{key,value -> [key, value.name]}");
        Map<String,Object> groupByCountryViaRegion = response.path("groupBy{it.region}.collectEntries{key,value -> [key, value.name]}");
        Map<String,Object> maxPopulationCountryAllInfo = response.path("max{it.population}");

        int hasMaxPopulationCountryPopulation = response.path("max{it.population}.population");
        String hasMaxPopulationCountryCapital = response.path("max{it.population}.capital");
*/

        ObjectMapper actualData = new ObjectMapper();
        actualData.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        country = actualData.readValue(response.asString(), Country[].class);

        List<String> swedishLanguageCountry = Arrays.stream(country)
                                            .filter(i -> i.getLanguages().stream().anyMatch(j -> j.getName().equals("Swedish")))
                                            .map(Country::getName)
                                            .collect(Collectors.toList());

        List<String> populationGraterThen50M = Arrays.stream(country)
                                                .filter(i-> i.getPopulation()>50000000)
                                                .map(Country::getName)
                                                .collect(Collectors.toList());

        List<String> subregionUnique = Arrays.stream(country).map(Country::getSubregion).distinct().collect(Collectors.toList());

        //System.out.println(subregionUnique);

        //Soft Assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(swedishLanguageCountry.contains(expectedData.get("OneOfSwedishLanguageCountry")));
        softAssert.assertTrue(populationGraterThen50M.contains(expectedData.get("OneOfCountryPopulationBiggerThen50M")));
        softAssert.assertTrue(subregionUnique.contains(expectedData.get("OneOfSubRegion")));
        softAssert.assertAll();
    }

}
