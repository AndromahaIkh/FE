package pojo;

import lombok.Getter;

@Getter
public class RegisterCustomerResponce {

    public Boolean success;
    public String user_id;

    public RegisterCustomerResponce(Boolean success, String user_id) {
        this.success = success;
        this.user_id = user_id;
    }

    public RegisterCustomerResponce() {
    }
}
