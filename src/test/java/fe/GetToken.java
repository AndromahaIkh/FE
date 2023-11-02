package fe;

import org.junit.jupiter.api.Test;
import pojo.AuthReq;
import pojo.AuthResp;

import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


public class GetToken {


    @Test
    void restTest2() {
        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec());

        AuthReq authReq = new AuthReq(CUSTOMEREMAIL, CUSTOMERPASSWORD);
        //Создаем экземпляр класса AuthReq


        // создаем новую переменную через которую передаем токен в последующие тесты
        AuthResp authResp = given()
                .when()
                .body(authReq)
                .post(ConfigProvider.URL + "/authentication/signin")
                .then()
                //.extract().response().jsonPath().getString("access"); //извлечекаем значение и передаем его в переменную token
                .extract().response().as(AuthResp.class);


        given()
                .when()
                .header("Authorization", "Bearer " + authResp.getAccess())
                .get(ConfigProvider.URL + "/user/profile/get")
                .then().
                assertThat().body("user.verified", is(1));
    }

}



