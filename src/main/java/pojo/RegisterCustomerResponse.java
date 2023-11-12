package pojo;

import lombok.Getter;

@Getter
public class RegisterCustomerResponse {

    public Boolean success;
    public String user_id;

    public RegisterCustomerResponse(Boolean success, String user_id) {
        this.success = success;
        this.user_id = user_id;
    }

}
