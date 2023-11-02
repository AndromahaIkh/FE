package pojo;

import static fe.ConfigProvider.CUSTOMEREMAIL;

public class ConfirmationEmailCustomer {

    private String email;
    private String user_id;

    public ConfirmationEmailCustomer() {
    }

    public ConfirmationEmailCustomer(String email, String user_id) {
        this.email = CUSTOMEREMAIL;
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
