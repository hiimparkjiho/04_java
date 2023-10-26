package source.src.main.java.com.ohgiraffers.section06.finalkeyword;

public class FinalFiledTest {
    /*
    * 필기
    * final
    * : final은 중단의 의미를 가지는 키워드이다.
    * final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만, 결국 변경은 불가의 의미이다.
    * 1. 지역변수 : 초기화 이 후 값 변경 불가 final String value = "final";
    * 2. 매개변수 : 호출시 전달한 인자 변경 불가 method(final String value;)
    * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    * 4. 클래스(static) 변수: 프로그램 start 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    * 6. static 메소드 : 메소드 재작성(overriding) 불가
    * 7. 클래스 : 상속 불가
    *
    * final은 변경 불가의 의미를 가진다.
    * 따라서 초기 인스턴스(생선된 객체)가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    * 그 초기화 이 후값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해 주어야 한다.
    * 그렇지 않으면 compile error가 발생한다.
    * */

    //private final int nonStaticNum; //int의 기본 자료형은 0인데 final이면 바꿀 수 없기에 에러가 남

    private final int NON_STATIC_NUM = 1;

    //private final String NON_STATIC_NAME;

//    public FinalFieldTest(String nonStaticName){
//        this.NON_STATIC_NAME = nonStaticName;
//    }
//
//    private static final int STATIC_NAME; // static
//
//    public FinalFiledTest(int nonStaticNum){
//        this.STA
//    }

    private static final double STATIC_DOUBLE;

    static{
        STATIC_DOUBLE = 10.0;   // static 초기화 블럭
    }


}
