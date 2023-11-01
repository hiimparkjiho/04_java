package main.java.com.ohgiraffer.section04.login.dto;

public class MemberDTO {

    private String loginId;
    private String password;

    public MemberDTO(){}

    public MemberDTO(String loginId, String password){  // 기본 생성자로 아이디, 비번 초기화
        this.loginId = loginId;
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
