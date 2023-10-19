package main.java.com.ohgiraffer.section01;

public class Application1 {  // 클래스
    int num = 20;
    public static void main(String[] args){ // 메소드
        /*
        * 메소드란?
        * 메소드(method)는 어떤 특성 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */
        System.out.println("main()메서드 시작함");

        // 새로운 함수를 만든다.
        Application1 app1; // 메모리에 공간 확보
        app1 = new Application1();  // app1이 가진 주도 application()이 가진 속성을 할당함(생성됨)
        app1.methodA();
        //System.out.println("hashcode : " + app1.hashCode());

    }
    public void methodA(){
        System.out.println("methodA() 호출.....");

        methodB();
        System.out.println("methodA() 종료.....");
    }

    public void methodB(){
        System.out.println("methodB 호출");

        methodC();
        System.out.println("methodB 종료");
    }

    public void methodC(){
        System.out.println("methodC 호출");
        System.out.println(("methodC 종료"));
    }

}
