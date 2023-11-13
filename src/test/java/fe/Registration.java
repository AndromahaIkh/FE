package fe;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import pojo.ConfirmationEmailCustomer;
import pojo.RegisterCustomer;
import pojo.RegisterCustomerResponse;


public class Registration {

    @Test
    public void readFromConfig() {

        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec());

        RegisterCustomer registerCustomer = RegisterCustomer.build("TEST AQA", 1);

        RegisterCustomerResponse registerCustomerResponse = RestAssured
                .given()
                .when()
                .body(registerCustomer)
                .post(ConfigProvider.URL + "/user/register")
                .then()
                .statusCode(200)
                .extract().as(RegisterCustomerResponse.class);
        System.out.println(registerCustomerResponse.getUser_id());

        ConfirmationEmailCustomer confirmationEmailCustomer = ConfirmationEmailCustomer.build(registerCustomerResponse.user_id);

        RestAssured
                .given()
                .when()
                .body(confirmationEmailCustomer)
                .post(ConfigProvider.URL + "/confirmation/code/email")
                .then();




    }


}
