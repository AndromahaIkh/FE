package fe;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;
import pojo.GetProfile;
import static org.hamcrest.Matchers.is;


public class GetToken {

    @Test
    public void testGetProfile() {
        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec());

        // Получаем авторизационный токен из класса AuthTokenService
        String authToken = GetAccessToken.getAuthToken();

        // Отправляем GET-запрос для получения профиля пользователя с использованием токена
   //     GetProfile getProfile = (GetProfile)
                        RestAssured.given()
                .header("Authorization", "Bearer " + authToken)
                .when()
                .get(ConfigProvider.URL + "/user/profile/get")
                .then()
                .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("UserTemplate.json"));
    }


}





