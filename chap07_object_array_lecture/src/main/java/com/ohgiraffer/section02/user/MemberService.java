package main.java.com.ohgiraffer.section02.user;

public class MemberService {

    public void signUpMembers(){    // ((no == 1) - 2)
        // Member[] 배열의 size를 5로 만들어줌
        Member[] members = new Member[5];
        // Member 배열에 Member 클래스를 생성하여 값을 넣어줌
        members[0] = new Member(1, "user01", "pass", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass", "유관순", 20, '여');
        members[2] = new Member(3, "user03", "pass", "이순신", 20, '남');
        members[3] = new Member(4, "user04", "pass", "신사임당", 20, '여');
        members[4] = new Member(5, "user05", "pass", "윤봉길", 20, '남');
        // ((no == 1) -3) memberRegister를 생성함
        MemberRegister memberRegister = new MemberRegister();
        // ((no == 1) -4) memberRegist.regist() 메서드에 Member[]를 매개변수로 전달하여 해당 메서드를 호출함
        memberRegister.regist(members);

    }

    public void showAllMembers(){
        // ((no ==2) -2) 생성자를 호출한다.
        MemberFinder finder = new MemberFinder();

        System.out.println("------가입 된 회원 목록 -------");
        for(Member member : finder.findAllMembers()){   // (no == 2) -3 Member클래스에서 생성자로 초기화한 member에 findAll 메서드로 불러온 회원
            //  정보(배열)를 향상된 for문으로 넣어준다 .
            if(member != null){ //(no == 2) -4 멤버가 비어있지 않다면 member의 정보를 getinfo 메소드 형식으로 모두 출력한다.
                System.out.println(member.getInfo());
            }
        }
        System.out.println("------------회원 조회 완료-------------");
    }
}
