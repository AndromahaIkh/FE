package pojo;

import lombok.Getter;

import static fe.ConfigProvider.CUSTOMEREMAIL;
import static fe.ConfigProvider.CUSTOMERPASSWORD;


@Getter
public class AuthReq {
    private String email;
    private String password;
    private String access;


    public AuthReq(String email, String password) {
        this.email = CUSTOMEREMAIL;
        this.password = CUSTOMERPASSWORD;
    }

    public AuthReq() {
    }
}

