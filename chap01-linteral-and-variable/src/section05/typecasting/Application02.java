package section05.typecasting;

public class Application02 {
    public static void main(String[] args){
        /*
        * 강제형전환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환 규칙
        *   1-1 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요
        *   1-2 실수를 정수로 변경 시 강제 형변환 필요
        *   1-3 문자형 int미만의 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *   1-4 논리형은 강제 형변환 규칙에서도 제외된다.
        * */

        // 1-1 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
        // 정수간의 강제 형변환
        long lnum = 8;
        int inum = (int) lnum; // 이와 같이 형변환을 하지 않을 경우 컴파일러는 데이터 손실의 위험때문에 에러를 발생시킨다.
        short snum = (short) inum;
        byte bnum = (byte)snum;

        //실수 간의 강제 형변환
        double dnum = 8.0;
        // float fnum = dnum // 이와 같이 형변환을 하지 않을 경우 컴파일러는 데이터 손실의 위험때문에 에러를 발생시킨다.
        float fnum = (float)dnum;
        System.out.println(fnum);

        // 실수를 정수로 변경 시 강제 형변환이 필요하다.
        float fnum2 = 4.0f;
        // long lnum2 = fnum2; 이와 같이 형변환을 하지 않을 경우 컴파일러는 데이터 손실의 위험때문에 에러를 발생시킨다
        long lnum2 = (long)fnum2; // 해당 형식으로 형변환을 하게 되면 소수점 이하의 값은 내림한다.

        // 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a';
        // byte sum2 = ch; // 자바에서 숫자로 취급하는 기본 자료형의 단위는 int이다. 이러한 이유로 char는 숫자로 변환시 int로 변경되기 때문에 다른 캐스팅 해줘야한다.
        byte bnum2 = (byte) ch;
        short snum2 = (short) ch;
        int inum2 = ch;

        // 정수를 문자에 대입시 강제 형변환이 필요하다.
        char ch3;
        char ch4;
        int inum3 = 98;
        // char의 경우 1byte의 크기를 갖기 때문에 int의 값을 명시하지 않으면 받을 수 없다.
        ch3 = (char)inum3;
        ch4 = (char)inum3;
        System.out.println(ch3);
        // 참고 boolean타입의 경우 형변환 규칙에서 제외되기 때문에 참고하자.
    }
}
