package source.src.main.java.com.ohgiraffers.section01.user_type;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args){

        String id = "user01";
        String pwd = "pass01";
        String name = "박지호";
        int age = 20;
        char gender = '남';
        String[] hobbys = new String[] {"축구", "볼링", "테니스"};

        print(id, pwd, name, age, gender, hobbys);
        System.out.println("================= 1년이 지나고=================");
        age = modifyAge(age);
        print(id, pwd, name, age, gender, hobbys);

        /* 위와 같이 변수를 개별적으로 활용해서 생기는 문제점
        * 1. 변수형을 다 관리해야 하는 어려움이 생긴다.
        * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값들을 인자로 전달해야 해서 한 눈에 안 들어온다.
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴 값으로 사용할 수 없다.(자료형이 서로 다르기 때문이다.)
        * */

        Member jiho = new Member();
        jiho.name = "지호";
        jiho.age = 26;
        jiho.id = "parkjiho";
        jiho.pwd = "jiho123";
        jiho.hobby = new String[]{"축구", "노래듣기", "요리"};
        jiho = modifyMember(jiho);
        System.out.println(jiho.toString());

//        String id2 = "user02";
//        String pwd2 = "pass02";
//        String name2 = "지민";
//        int age2 = 20;
//        char gender2 = '남';
//        String[] hobbys2 = new String[] {"축구", "볼링", "테니스"};
//        print(id2, pwd2, name2, age2, gender2, hobbys2);

    }
    public static void print(String id, String pwd, String name, int age, char gender, String[] hobbys){
        System.out.println(id + "님이 " + pwd + "로그인을 하셨습니다.");
        System.out.println("로그인한 사용자 이름은 " + name + " 나이는 : " + age + " 성별은 " + gender + " 취미는 : ");
        for(String hobby :hobbys){
            System.out.print(hobby + " ");
        }
        System.out.println("입니다");
    }

    public static int modifyAge(int age){
        if(age < 0){
            return 0;
        }
        return age + 1;
    }

    public static Member modifyMember(Member member){
        member.age = member.age + 1;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("취미가 변경");
//        String value = scan.nextLine();
//        if(value.equals("y")){
//            // 취미 다시 입력받기
//        }
        return member;
    }
}
