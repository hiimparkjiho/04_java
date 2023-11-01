package main.java.com.ohgiraffer.section04.login.service;

import main.java.com.ohgiraffer.section04.login.auth.SnsAuth;
import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;

public class MemberService {

    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth){
        this.snsAuth = snsAuth;
    }
    public boolean findMember(MemberDTO memberDTO){
        boolean result = snsAuth.login(memberDTO);
        return result;
    }
}
