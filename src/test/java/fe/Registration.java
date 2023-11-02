package fe;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import pojo.ConfirmationEmailCustomer;
import pojo.RegisterCustomer;
import pojo.RegisterCustomerResponce;
import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;


public class Registration {

    @Test
    public void readFromConfig() {

        Specification.installSpec(Specification.requestSpec(), Specification.responseSpec());

        RegisterCustomer registerCustomer = new RegisterCustomer("TEST AQA", CUSTOMEREMAIL, CUSTOMERPASSWORD, 1);
        RegisterCustomerResponce registerCustomerResponce = RestAssured
                .given()
                .when()
                .body(registerCustomer)
                .post(ConfigProvider.URL + "/user/register")
                .then()
                // .extract().response().jsonPath().getString("user_id");
                .extract().response().as(RegisterCustomerResponce.class);

        ConfirmationEmailCustomer confirmationEmailCustomer = new ConfirmationEmailCustomer(registerCustomer.getEmail(), registerCustomerResponce.user_id);

        RestAssured
                .given()
                .when()
                .body(confirmationEmailCustomer)
                .post(ConfigProvider.URL + "/confirmation/code/email")
                .then();
    }


}