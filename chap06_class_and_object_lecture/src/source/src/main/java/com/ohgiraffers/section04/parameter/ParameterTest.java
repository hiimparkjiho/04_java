package source.src.main.java.com.ohgiraffers.section04.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달받은 것 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개 변수로 전달받은 것 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(Rectangle rectangle){
        System.out.println("매개변수로 전달받은 값 : " + rectangle);
        System.out.println("변경 전 사각형의 넓이와 둘레 =====");
        rectangle.calcArea();
        rectangle.calcRound();
        System.out.println("변경 후 사각형의 둘레와 넓이 : ");
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.calcArea();
        rectangle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String...hobby){  // 가변변 배열의 길이를 모를 때
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : ");
        for(String hobbys: hobby){
            System.out.print(hobbys + " ");
        }
        System.out.println();
    }
}
