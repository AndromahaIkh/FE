package fe.pojo;

// todo: улучшить внешний вид с помощью lombok
// todo: а почему вообще папка pojo два раза в main?
public class AuthReq {

    private String email;
    private String password;
    private String access;

    public AuthReq(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AuthReq() {
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

