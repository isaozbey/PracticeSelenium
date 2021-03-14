package API_Practice;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class practice_BossBaby {

    @BeforeAll
    public static void init(){
        baseURI="http://www.omdbapi.com/";
    }


    @Test
    public void test1(){

       Response response=

        given()

                .queryParam("apikey","dfef56c2")
                .queryParam("t","Boss Baby").
        when()
              .get();


       //response.prettyPrint();
        System.out.println("response.path(\"Title\") = " + response.path("Title"));


    }

    @Test
    public void test2(){
        Response response=

        given()
               .queryParam("apikey","dfef56c2")
               .queryParam("t","Boss Baby").

        when()
              .get()
              .prettyPeek()  ;

        JsonPath jp=response.jsonPath();
        System.out.println("jp.getString(\"Title\") = " + jp.getString("Title"));

        Map<String,Object> map=jp.getMap("");

        System.out.println("map = " + map.get("Awards"));

        System.out.println("response.jsonPath().getMap(\"Ratings[0]\") = " + response.jsonPath().getMap("Ratings[0]"));

        List<Map<String,Object>> listMap=jp.getList("Ratings");

        List<Object> list1=jp.getList("Ratings.Source");

        System.out.println("list1 = " + list1);


    }
}
