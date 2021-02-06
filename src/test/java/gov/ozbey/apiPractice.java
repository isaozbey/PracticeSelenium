package gov.ozbey;



import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class apiPractice {

    @Test
    public void test1(){


        Response response= RestAssured.get("http://100.25.164.116:8000/api/hello");

        System.out.println(response.statusCode());

        System.out.println("response.header(\"Date\") = " + response.header("Date"));

        System.out.println("response.getHeader(\"Content-Type\") = " + response.getHeader("Content-Type"));

        System.out.println("response.asString() = " + response.body().asString());


    }

    @Test
    public void test2(){





    }
}
