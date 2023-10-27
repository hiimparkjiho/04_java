package main.java.com.ohgiraffer.section02.user;

public class MemberRegister {

    public void regist(Member[] members){ // ((no == 1) -5)
        System.out.println("회원을 등록합니다.");
        // 전달 받은 매개변수 members에서 각 인덱스(위치)값을 한 개씩 꺼낸다..
        for(Member member : members){
            // member 클래스에 선언된 getInfo() 메서드를 호출한다.
            System.out.println(member.getInfo() +
                    /*
                    *  ((no == 1) -7) member.getInfo()에서 전달받은 문자열과 뒤에 문자열을 합치고 사용자 화면에 보여준다.
                    * */
                    "님을 회원 등록에 성공했습니다.");
        }
        //  ((no == 1) -8) memberRepository.store 메서드의 매개변수로 member[]을 전달하고 호출한다.
        if(MemberRepository.store(members)){    // store에서 반환 받은 값이 true이면 아래의 나용을 출력한다.
            System.out.println("총 " + members.length + "명의 회원등록에 성공했습니다.");
        }

    }
}
