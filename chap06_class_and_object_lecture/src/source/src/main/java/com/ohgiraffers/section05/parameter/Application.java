package source.src.main.java.com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args){
        ParameterTest parameterTest = new ParameterTest();

        int num = 20;
        parameterTest.testPrimaryTypeParameter(num);

        int[] iarr = new int[] {1,2,3,4,5,6,7};
        System.out.println("인자로 전달하는 값 : " + iarr[0]);
        parameterTest.testPrimaryTypeArrayParameter(iarr);
        System.out.println("전달 후 iarr의 값 : " + iarr[0]);    // 주소 값을 공유하기 때문에 값이 변한다.
        System.out.println();

        Rectangle r1 = new Rectangle(12.5, 22.5);// 생성자는 반환 값이 없다. 클래스 명을 그대로 따라간다.
        System.out.println("인자로 전달받은 r1의 값 : " + r1);
        parameterTest.testClassTypeParameter(r1);
        r1.calcRound();
        r1.calcArea();

        System.out.println("변경 후 사각형의 넓이와 둘레: ");
        r1.calcRound();
        r1.calcArea();
        // 가변인자
        parameterTest.testVariableLengthArrayParameter("홍길동");
        parameterTest.testVariableLengthArrayParameter("홍길동", "농구", "축구", "음악감상");// 취미는 있을 수도 있고 없을 수도 있다. 앞에 ...을 붙여서 가변인자를 사용했기 때문!
    }

}
