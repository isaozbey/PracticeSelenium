package API_Practice;




import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class practice_1 {

@Test
public void test1(){

    Response response=get("http://18.212.101.123:8000/api/hello");
    System.out.println("response.getStatusCode() = " + response.getStatusCode());
    System.out.println("response.header(\"Date\") = " + response.header("Date"));
    System.out.println("response.getContentType() = " + response.getContentType());
    System.out.println("response.getHeaders() = " + response.getHeaders());


}

@Test
 public void test2(){

    Response response=get("http://18.212.101.123:8000/api/hello");
    assertEquals(200,response.getStatusCode());
    System.out.println("response.body() = " + response.asString());

    assertThat(response.asString(), is("Hello from Spartan"));


}

@Test
public void test3(){

    when()
            .get("http://18.212.101.123:8000/api/hello").
    then()
            .statusCode(200);


}





}
