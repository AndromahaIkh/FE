package fe;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.AuthReq;

import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;

public class GetAccessToken {

    public static String getAuthToken() {
        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec());

        AuthReq authReq = new AuthReq(CUSTOMEREMAIL, CUSTOMERPASSWORD);


        // Отправляем POST-запрос для аутентификации и получения токена
        Response response = RestAssured.given()
                .contentType("application/json")
                .body(authReq)
                .when()
                .post(ConfigProvider.URL +"/authentication/signin");

        // Извлекаем и возвращаем авторизационный токен из ответа
        return response.jsonPath().getString("access");
    }

}






