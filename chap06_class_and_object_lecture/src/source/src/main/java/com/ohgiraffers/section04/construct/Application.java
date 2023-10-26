package source.src.main.java.com.ohgiraffers.section04.construct;

public class Application {
    public static void main(String[] args){
        /*
        * 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
        * 기본 생성자는 conpiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용하였다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않은 것이다.)
        * */

        // 기본 자료형
        int a;
        a = 10; // 변수를 10으로 초기화한다.
        // 변수 == 주소 == 값a

        // 참조 자료형 == 래퍼런스 타입 == 사용자 정의
        User user;  // 변수 선언
        //System.out.println(user.hashCode()); // 주소를 가지지 않는다 참조 자료형은 크기가 한정되지 않았기 때문이다.
        //변수 == 주소 == 속성 키보드
        //변수(주소값을 가진다)
        user = new User(); // 변수를 생성한다.
        System.out.println(user.hashCode());

        User user1 = new User();
    }



}
