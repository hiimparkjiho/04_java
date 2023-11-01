package main.java.com.ohgiraffer.section02.Calander;

import java.util.Date;

public class Application {
    public static void main(String[] args){
        /*
        * Date 클래스
        * jdk 1.0부터 날짜를 취급하기 위해 사용되던 Date클래스는
        * 생성자를 비롯하여 대부분의 메소드가 Deprecated 되어 있다.
        *
        * Deprecated?
        * 향 후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는다는 의미이다.
        * 하지만 하위버전의 호환성때문에 한 번에 제거되는 것은 아니고 남겨두었기 때문에 사용하는 것은 가능하다.
        *
        * jdk 1.1 부터는 새롭게 제공되는 Calender 클래스를 이용하여 날짜와 시간에 관한 처리를 하게된다...
        * 하지만 Calender 클래스는 몇 가지 문제를 가지고 있다.
        * 1. Calender 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
        * 2. 윤초(leep second)를 고려하지 않는다.
        *   윤초란?
        *   형정 세계시에서 사용하는 세슘 원자 시계와 실제 지구의 자전/공정 속도를 기준으로 항 태양시의 차이로 인해
        *   발생한 모자를 보정하기 위해 추가하는 1초이다..
        *   12월 31일의 마지막에 추가하거나 혹은 6월 30일 마지막에 추가한다.
        *   윤초는 사소해 보이지만 실제 2012년 링크드안과 같은 대규모 서비스의 서버를 마비시킨 버그를 발생한 적도 있다.
        *3. calender 클래스는 월을 나타낼 때 0부터 11까지로 표현하는 불편한이 있다..
        *
        * jdk 1.8에서는 이러한 모든 문제를 해결할 수 있는 time 패키지를 제공하고 있다.
        *
        * Date는 java.sql.Date와 java.util.Date가 존재한다.
        * 한 클래스에서 두 개의 타입을 전부 사용하게 되면 import를 하더라도 사용하는 타입이
        * 어느 패키지에 있는지 모호성이 발생되어 import를 하여도 클래스의 이름에 풀 패키지 경로를 입력해야 한다.
        * 주의하자.
        * */

        Date today = new Date();
        System.out.println(today);

        // getTime()은 1970년 1월 0시 0초 이 후 지난 시간을, millsecond로 계산하여 long 타입으로 반환한다.
        System.out.println(today.getTime());

        Date time = new Date(1698815856284L);
        System.out.println(time);

//        영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
//        이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
//        단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
//        The Curious Case of Benjamin Button
//        예제 출력 1
//        6




    }
}
