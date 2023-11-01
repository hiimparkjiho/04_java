package main.java.com.ohgiraffer.section04.login;

import main.java.com.ohgiraffer.section04.login.dto.MemberDTO;
import main.java.com.ohgiraffer.section04.login.impl.GoogleAuth;
import main.java.com.ohgiraffer.section04.login.impl.KakaoAuth;
import main.java.com.ohgiraffer.section04.login.impl.NaverAuth;
import main.java.com.ohgiraffer.section04.login.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        MemberService memberService;
        do{
            MemberDTO memberDTO = new MemberDTO();
            System.out.println("---------- 사용자 인증 프로그램 입니다-------------");
            System.out.println("1번 google 로그인");
            System.out.println("2번 naver 로그인");
            System.out.println("3번 kakao 로그인");
            System.out.println("9번 프로그램 종료");
            System.out.println("로그인 한 인증 수단을 선택해주세요");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            scan.nextLine();
            System.out.println("아이디를 입력해주세요 : ");
            memberDTO.setLoginId(scan.nextLine());
            System.out.println("비밀번호를 입력해주세요 : ");
            memberDTO.setPassword(scan.nextLine());

            boolean result;
            String type;
            switch (choice){
                case 1 : memberService = new MemberService(new GoogleAuth());
                    result = memberService.findMember(memberDTO);
                    if(result){
                        System.out.println("google로그인에 성공하였습니다");
                    }
                    break;
                case 2 : memberService = new MemberService(new NaverAuth());
                    result = memberService.findMember(memberDTO);
                    if(result){
                        System.out.println("naver 로그인에 성공하였습니다");
                    }
                    break;
                case 3 : memberService = new MemberService(new KakaoAuth());
                    result = memberService.findMember(memberDTO);
                    if(result){
                        System.out.println("kakao 로그인에 성공하였습니다");
                    }
                    break;

                case 9 :
                    System.out.println("로그인을 종료합니다");
                    return;
            }
        }while (true);


    }

}
