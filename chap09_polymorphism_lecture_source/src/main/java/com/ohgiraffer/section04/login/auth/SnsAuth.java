package main.java.com.ohgiraffer.section04.login.auth;

import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;

public interface SnsAuth {
    // boolean 으로 로그인 메서드 구현
    default boolean login(MemberDTO memberDTO){
        if(memberDTO.getLoginId().contains(memberDTO.getLoginId()) && memberDTO.getPassword().contains(memberDTO.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
