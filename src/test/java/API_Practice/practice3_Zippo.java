package API_Practice;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class practice3_Zippo {

    @BeforeAll
    public static void init(){
        baseURI="http://api.zippopotam.us";
        basePath="/us";

    }

    @Test
    public void test1(){

        given()
                .pathParam("zip",44512).
        when()
              .get("/{zip}").
        then()
              .statusCode(200)
              .log().body()
              .body("'post code'", is ("44512"));
    }

    @Test
    public void test2(){


        given()
                .pathParam("state","OH")
                .pathParam("city","Youngstown").

        when()
              .get("/{state}/{city}").
        then()
               .statusCode(200)
               .log().body()
               .body("places[0].'place name'", is("Youngstown"));
    }

    @Test
    public void test3(){

    }




}
