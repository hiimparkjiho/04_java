package main.java.com.ohgiraffer.section04.login.impl;

import main.java.com.ohgiraffer.section04.login.auth.SnsAuth;
import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;

public class NaverAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO naverMember = new MemberDTO("naver", "pass");

        if(!naverMember.getLoginId().equals(memberDTO.getLoginId())){
            System.out.println("네이버 회원정보와 아이디가 일치하지 않습니다");
            return false;
        }else{
            if(!naverMember.getPassword().equals(memberDTO.getPassword())){
                System.out.println("네이버 회원정보와 비밀번호가 일치하지 않습니다");
                return false;
            }
        }
        return true;
    }
}
