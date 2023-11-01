package main.java.com.ohgiraffer.section04.login.auth;

import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;

public interface SnsAuth {
    // boolean 으로 로그인 메서드 구현
    boolean login(MemberDTO memberDTO);
}
