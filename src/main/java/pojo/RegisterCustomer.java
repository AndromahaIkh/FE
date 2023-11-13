package pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;

@Data
@Accessors(chain = true)
public class RegisterCustomer {
    //регистрация Заказчика
    private String name;
    private String email;
    private String password;
    private Integer user_type;

    public static RegisterCustomer build(String name, Integer user_type) {
        return new RegisterCustomer().setEmail(CUSTOMEREMAIL)
                .setPassword(CUSTOMERPASSWORD)
                .setName(name)
                .setUser_type(user_type);
    }

}
