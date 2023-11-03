package pojo;

import lombok.Getter;

import static fe.ConfigProvider.CUSTOMEREMAIL;

@Getter
public class ConfirmationEmailCustomer {

    private String email;
    private String user_id;

    public ConfirmationEmailCustomer() {
    }

    public ConfirmationEmailCustomer(String email, String user_id) {
        this.email = CUSTOMEREMAIL;
        this.user_id = user_id;
    }
}
