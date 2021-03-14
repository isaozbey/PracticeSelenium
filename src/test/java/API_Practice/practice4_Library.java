package API_Practice;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class practice4_Library {

    public  String token=getToken("librarian69@library","KNPXrm3s");

    @BeforeAll
    public static void init(){

        baseURI="http://library2.cybertekschool.com";
        basePath="/rest/v1/";
    }
    public static String getToken(String username, String password) {
        String token="";
        Response response=
        given()
                .contentType(ContentType.URLENC)
                .formParam("email","librarian568@library")
                .formParam("password","SjvLOgHC").
        when()
                .post("/login");

        token=response.path("token");
        return token;
    }

    @Test
    public void test1(){

        given()
                .log().all()
                .formParam("email","librarian568@library")
                .formParam("password","SjvLOgHC").
        when()
              .post("/login").
        then()
              .statusCode(200)
               .log().all();
    }

    @Test
    public void test2(){

        System.out.println("token = " + practice4_Library.getToken("librarian568@library", "SjvLOgHC"));
    }

    @Test
    public void test3(){
        String token=getToken("librarian69@library","KNPXrm3s");
        String token1="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjp7ImlkIjoiODQ0IiwiZnVsbF9uYW1lIjoiVGVzdCBMaWJyYXJpYW4gNTY4IiwiZW1haWwiOiJsaWJyYXJpYW41NjhAbGlicmFyeSIsInVzZXJfZ3JvdXBfaWQiOiIyIn0sImlhdCI6MTYxNTY4NTg4OCwiZXhwIjoxNjE4Mjc3ODg4fQ._kCT_ULgEiUFHIxBvIwjRJfb1kiwTsIp-ZjYMVlIZiU";
        given()
                .log().all()
                .header("x-library-token",token);
        when()
              .get("/dashboard_stats").
         then()
               .statusCode(200);


    }

    @Test
    public void test4(){

        given()
                .log().all()
                .contentType(ContentType.URLENC)
                .formParam("token",token).
        when()
              .post("/decode").
        then()
               .statusCode(200)
               .log().all();

    }
}
