package api.pojo

class AuthReq {

    private String email;
    private String password;
    final String access

    AuthReq(String email, String password) {
        this.email = email
        this.password = password
    }

    AuthReq() {
    }

    String getEmail() {
        return email
    }

    String getPassword() {
        return password
    }

    void setEmail(String email) {
        this.email = email
    }

    void setPassword(String password) {
        this.password = password
    }
}
