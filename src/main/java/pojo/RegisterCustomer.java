package pojo;

import lombok.Getter;

import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;

@Getter
public class RegisterCustomer {
    //регистрация Заказчика
    private String name;
    private String email;
    private String password;
    private Integer user_type;

    // todo: меня немного (МНОГО) напрягает, что ты передаешь email, но жестко его харкодишь в this.email
    // подумай, точно ли все верно?
    public RegisterCustomer(String name, String email, String password, Integer user_type) {
        this.name = name;
        this.email = CUSTOMEREMAIL;
        this.password = CUSTOMERPASSWORD;
        this.user_type = user_type;
    }

    public RegisterCustomer() {
    }
}
