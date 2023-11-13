package pojo;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RegisterCustomerResponse {

    public Boolean success;
    public String user_id;


/*
    public RegisterCustomerResponse(Boolean success, String user_id) {
        this.success = success;
        this.user_id = user_id;
    }

 */


}
