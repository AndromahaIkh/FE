package pojo;

import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;

public class RegisterCustomer {
    //регистрация Заказчика
    private String name;
    private String email;
    private String password;
    private Integer user_type;
    //  private String phone;

    public RegisterCustomer(String name, String email, String password, Integer user_type) {
        this.name = name;
        this.email = CUSTOMEREMAIL;
        this.password = CUSTOMERPASSWORD;
        this.user_type = user_type;
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


}
