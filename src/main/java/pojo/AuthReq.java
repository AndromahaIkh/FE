package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;

import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;


@Getter

public class AuthReq {
    private String email;
    private String password;

    public AuthReq(String email, String password) {
        this.email = CUSTOMEREMAIL;
        this.password = CUSTOMERPASSWORD;
    }

    public AuthReq() {
    }
}

