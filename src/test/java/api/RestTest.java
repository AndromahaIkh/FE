package api;

import api.pojo.*;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;


public class RestTest {
    private final static String URL = "https://api-test.flat-expo.com/";
    /*

        @Test
        void restTest() {
            Specification.installSpec(Specification.requestSpec(URL), Specification.responseSpecOk200());


            RegisterCustomer registerCustomer = new RegisterCustomer("Automated Test", "qohtok@mailto.plus", "QETU111!!!", 1, "NO");

            RegisterCustomerResponce registerCustomerResponce = RestAssured
                    .given().log().all()
                    .when()
                    .body(registerCustomer)
                    .post("/user/register")
                    .then().log().all()
                    // .extract().response().jsonPath().getString("user_id");
                    .extract().response().as(RegisterCustomerResponce.class);

            ConfirmationEmailCustomer confirmationEmailCustomer = new ConfirmationEmailCustomer(registerCustomer.getEmail(), registerCustomerResponce.user_id);

            RestAssured
                    .given().log().all()
                    .when()
                    .body(confirmationEmailCustomer)
                    .post("/confirmation/code/email")
                    .then().log().all();
        }


             */
        @Test
        void restTest2 () {
            Specification.installSpec(Specification.requestSpec(URL), Specification.responseSpecOk200());

            AuthReq authReq = new AuthReq("cuwyh@mailto.plus", "QETU111!!!");
            // создаем новую переменную через которую передаем токен в последующие тесты

            String token = RestAssured
                    .given().log().all()
                    .when()
                    .body(authReq)
                    .post("/authentication/signin")
                    .then().log().all()
                    .extract().response().jsonPath().getString("access"); //извлечекаем значение и передаем его в переменную token
                   // .extract().response().as(AuthResp.class);

            RestAssured
                    .given().log().all()
                    .when()
                    .header("Authorization", "Bearer" + token )
                    .get("/user/profile/get")
                    .then().log().all();


        }


    }
