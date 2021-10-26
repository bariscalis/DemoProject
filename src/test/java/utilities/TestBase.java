package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBase {
    protected RequestSpecification spec01;
    protected RequestSpecification spec02;
    protected RequestSpecification spec03;

    @Before
    public void setSpec01(){
        spec01 = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
    }

    @Before
    public void setSpec02(){
        //spec02 = new RequestSpecBuilder().setBaseUri("https://restcountries.eu/rest/v2/all").build();
        spec02 = new RequestSpecBuilder().setBaseUri("https://restcountries.com/v2/all").build();
    }

    @Before
    public void setSpec03(){
        spec03 = new RequestSpecBuilder().setBaseUri("https://api.itbook.store/1.0").build();
        /*
        https://api.itbook.store/
        Search books by title, author, ISBN or keywords
        /search/{query}
        /search/{query}/{page}
        https://api.itbook.store/1.0/search/keyword
         */
    }
}
