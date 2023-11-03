package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AuthResp {

    private String refresh;
    private String access;
    private Boolean success;
}

