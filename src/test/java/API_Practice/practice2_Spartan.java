package API_Practice;


import com.github.javafaker.Faker;
import io.cucumber.java.sl.In;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class practice2_Spartan {

    @BeforeAll
    public static void setup(){

        baseURI="http://18.212.101.123";
        port=8000;
        basePath="/api";
    }


    @Test
    public void test1(){

        given()

                .log().all()
                .header("Accept","application/json").
        when()
                .get("/spartans")
                .
        then()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .log().body()
                ;

    }

    @Test
    public void test2(){

        given()
                .log().all()
                .pathParam("id",3)
                .accept(ContentType.JSON).
        when()
                .get("/spartans/{id}").
        then()
              .statusCode(is(200))
              .log().body();


    }

    @Test
    public void test3(){

        given()
                .queryParam("gender","male")
                .queryParam("nameContains","ea").
        when()
              .get("/spartans/search").
        then()
               .statusCode(200)
               .log().body();

    }

    @Test
    public void test4(){

        Response response=

        when()
                .get("/spartans")
                ;



        JsonPath jp=response.jsonPath();



        List<String> list_Id=jp.getList("id");
        System.out.println("list_Id = " + list_Id);

    }

    @Test
    public void test5(){

        String spartan= "{\n" +
                "    \"name\":\"Sergen1\",\n" +
                "    \"gender\":\"Male\",\n" +
                "    \"phone\":3302587896\n" +
                "}";
        given()
                .contentType(ContentType.JSON)
                .body(spartan)
                .log().all().
        when()
              .post("/spartans").
        then()
              .statusCode(201);

    }

    @Test
    public void test6(){

        String updated="    {\n" +
                "        \"id\": 97,\n" +
                "        \"name\": \"Sergen\",\n" +
                "        \"gender\": \"Male\",\n" +
                "        \"phone\": 6586151920\n" +
                "    }";
        given()
                .contentType(ContentType.JSON)
                .body(updated)
                .log().all().
        when()
              .put("spartans/{id}",97).
        then()
              .statusCode(204);



    }

    @Test
    public void test7(){

        File file=new File("spartan.json");
        given()
                .contentType(ContentType.JSON)
                .body(file).
        when()
              .post("/spartans").
        then()
                .statusCode(201);

    }


    @Test
    public void test8(){

        Map<String,Object> bodyMap=new HashMap<>();
        bodyMap.put("name","Atiba");
        bodyMap.put("gender","Male");
        bodyMap.put("phone",1234567890L);


        given()
                .contentType(ContentType.JSON)
                .body(bodyMap)
                .log().all().
        when()
              .post("/spartans").
        then()
               .statusCode(201);


    }

    @Test
    public void test9(){

        Spartan spartan=new Spartan("101","Okkes","Male",1234567890L);

        given()
                .contentType(ContentType.JSON)
                .body(spartan)
                .log().all().
        when()
                .post("/spartans").
        then()
              .statusCode(201);

    }

    @Test
    public void test10(){

          Map<String,Object> updatedBody=new LinkedHashMap<>();
          updatedBody.put("name",new Faker().name().firstName());
          updatedBody.put("gender","Male");
          updatedBody.put("phone",7412589630L);

          given()
                  .contentType(ContentType.JSON)
                  .log().all()
                  .body(updatedBody).
          when()
                .put("/spartans/{id}",5).
          then()
                 .statusCode(204);

    }

    @Test
    public void test11(){
        Response response=
        given()
                .log().all()
                .pathParam("id",97).
        when()
              .get("/spartans/{id}")
              .prettyPeek() ;


        Spartan sp2=response.as(Spartan.class);

        System.out.println("sp2 = " + sp2);


    }

    @Test
    public void test12(){

        Response response=
        given()
                .log().all()
                .queryParam("gender","male").
        when()
              .get("/spartans/search")
              ;

        JsonPath jp=response.jsonPath();
        System.out.println("jp.getInt(\"content[0].id\") = " + jp.getInt("content[0].id"));
        Spartan sp3= jp.getObject("content[0]",Spartan.class);

        System.out.println("sp3 = " + sp3);



    }

    @Test
    public void test13(){
        Response response=

        given()
              .log().all()
              .queryParam("gender","male").
        when()
               .get("/spartans/search") ;

        JsonPath jp=response.jsonPath();

        List<Spartan> spartanList=jp.getList("content",Spartan.class);



    }


}
