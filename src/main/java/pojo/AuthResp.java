package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class AuthResp {

    private String refresh;
    private String access;
    private Boolean success;

    public AuthResp(String refresh, String access, Boolean success) {
        this.refresh = refresh;
        this.access = access;
        this.success = success;
    }

}

