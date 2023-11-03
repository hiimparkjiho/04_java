package main.java.com.ohgiraffers.understand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        // 회원 제한은 없으며 체력을 관리해야 한다.
        // 10명의 회원 유형도 자율이다.

        Kiyu kiyu = new Kiyu();
        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("박지호", 60));
        members.add(new MemberDTO("유재석", 55));
        members.add(new MemberDTO("박명수", 65));
        members.add(new MemberDTO("노홍철", 75));
        members.add(new MemberDTO("하동훈", 58));
        members.add(new MemberDTO("길성준", 110));
        members.add(new MemberDTO("정준하", 100));
        members.add(new MemberDTO("정형돈", 90));
        members.add(new MemberDTO("조세호", 80));
        members.add(new MemberDTO("권지용", 60));
        Scanner scan = new Scanner(System.in);
        String[] value = scan.nextLine().split(" ");
        for(int i = 0; i < members.size(); i++){
            System.out.println(members.get(i));
            String result = value[i];
        }
    }
}
