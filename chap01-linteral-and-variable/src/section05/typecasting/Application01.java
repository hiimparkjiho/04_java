package section05.typecasting;

public class Application01 {
    public static void main(String[] args){
        /*
        * 데이터 형변환
        * 데이터 형변환이 필요한 이유
        * -자바에서 다른 타입끼리의 연산은 모두 같은 타입인 경우 실행할 수 있다.
        * -즉, 같은 데이터 타입끼리만 수정할 수 있다.
        * */

        /*
        * 형변환의 종류와 규칙
        * 1. 자동형변환(목시적 형변환) : 자동으로 수행해주는 타입 변환
        * 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환한다.
        * 1-2. 정수는 실수로 자동 형변환한다.
        * 1-3. 문자형은 int 형으로 자동 형변환한다.
        * 1-4. 문자형은 형변환 규칙에서 제외된다.
        * 2. 강제 형변환(명시적 형번환) : 형변환 cast 연산자를 이용한 잠재적으로 수행하는 형변환
        *  2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        * */

        // 목차1. 자동현변환 규칙 테스트
        // 목차 1-1 작은 자료형에서 큰 자료형으로 자동 형변환
        // 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 컴파일러가 자동으로 처리해준다.

        // 1-1-1 정수끼리의 자동 형변환
        // 점점 더 큰 자료형으로 데이터를 옮겨도 문제점이 자동 형변환 처리된다.
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        // 연산시에도 자동으로 큰 폭 자료형에 맞춰서 계산한다.
        int num1 = 10;
        int num2 = 20;

        long result = num1 + num2;
        // int result = num1 + num2;  // 작은 자료형과 큰 자료형 연산시 큰 자료형으로 자료형이 변경 됨

        System.out.println("result = " + result);

        /*
        * 1-2 정수는 실수로 자동 형변환 한다.
        * 정수를 실수로 변경할 때 소수점 자리수가 없어도 실수형태로 표현이 가능하다.
        * 이 때 데이터 손실이 없기 때문에 자동 형변환이 가능하다.
        * */

        long eight = 8;
        float four = eight;
        System.out.println("four = " + four);

        // 실수와 정수 연산
        float result3 = eight + four;
        System.out.println("result3 = " + result3);

        char ch1 = 'a';
        int charNumber = 97;

        char chValue = (char)charNumber;
        System.out.println((int)ch1);
        System.out.println(chValue);
        System.out.println((char)charNumber);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

        // 1-4. 논리형 형변환 규칙에서 제외
        boolean isTrue = false;
//        byte b1 = isTrue;
//        String test = isTrue;

    }
}
