package main.java.com.ohgiraffer.section04.login.auth;

import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;

public class NaverAuth extends MemberDTO implements SnsAuth{
    @Override
    public String getLoginId() {
        return "jiho5449";
    }

    @Override
    public String getPassword() {
        return "12345";
    }

    @Override
    public boolean login(MemberDTO memberDTO) {
        return false;
    }

    SnsAuth snsAuth = new SnsAuth() {
        @Override
        public boolean login(MemberDTO memberDTO) {
            return SnsAuth.super.login(memberDTO);
        }
    };
}
