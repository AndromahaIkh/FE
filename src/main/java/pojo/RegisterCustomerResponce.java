package pojo;

public class RegisterCustomerResponce {

    public Boolean success;
    public String user_id;

    public Boolean getSuccess() {
        return success;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public RegisterCustomerResponce(Boolean success, String user_id) {
        this.success = success;
        this.user_id = user_id;
    }

    public RegisterCustomerResponce() {
    }
}