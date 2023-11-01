package main.java.com.ohgiraffer.section04.login.impl;

import main.java.com.ohgiraffer.section04.login.auth.SnsAuth;
import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override   // 인터페이스의 메소드를 재정의
    public boolean login(MemberDTO memberDTO) {
        MemberDTO googleMember = new MemberDTO("google", "pass");   // MemberDTO 클래스에서 가져온 기본 생성자를 초기화

        if(!googleMember.getLoginId().equals(memberDTO.getLoginId())){  // 구글에 저장되어 있는 아이디와
            System.out.println("구글 회원정보와 아이디가 일치하지 않습니다");
            return false;
        }else{
            if(!googleMember.getPassword().equals(memberDTO.getPassword())){
                System.out.println("구글 회원정보와 비밀번호가 일치하지 않습니다");
                return false;
            }
        }
        return true;
    }
}
