package api.pojo;

public class RegisterCustomer {
    private String name;
    private String email;
    private String password;
    private Integer user_type;
    private String phone;

    public RegisterCustomer(String name, String email, String password, Integer user_type, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.user_type = user_type;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public String getPhone() {
        return phone;
    }
}
