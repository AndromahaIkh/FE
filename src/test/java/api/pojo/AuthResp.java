package api.pojo;

public class AuthResp {

    private String refresh;
    private String access;
    private Boolean success;

    public AuthResp() {
    }

    public AuthResp(String refresh, String access, Boolean success) {
        this.refresh = refresh;
        this.access = access;
        this.success = success;
    }

    public String getRefresh() {
        return refresh;
    }

    public String getAccess() {
        return access;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }


}

