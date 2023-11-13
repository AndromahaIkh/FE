package pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import static fe.ConfigProvider.CUSTOMEREMAIL;

@Data
@Accessors(chain = true)
public class ConfirmationEmailCustomer {

    private String email;
    private String user_id;

    public static ConfirmationEmailCustomer build(String user_id) {
        return new ConfirmationEmailCustomer().setEmail(CUSTOMEREMAIL)
                .setUser_id(user_id);
    }
}
