package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Specification {
     // статичные методы для запроса + спецификация для ответа
    public static RequestSpecification requestSpec(String URL) {
        return new RequestSpecBuilder()
                .setBaseUri(URL)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification responseSpecOk200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    //статик исполюзую, чтобы не создавать экземпляр класса
    public static void installSpec(RequestSpecification request, ResponseSpecification response){
        RestAssured.requestSpecification = (RequestSpecification) request;
        RestAssured.responseSpecification = response;
    }

}
