package source.src.main.java.com.ohgiraffers.section08.initblok;

public class Product {
    private String name;
    private int price;
    private static String brand;

    // 인스턴스 초기화 출력
    {
        name = "사이언";
        price = 10000;
        brand = "사과";
    }

    static{// 생명주기가 달라서
//        name = "손오공";
//        price = 10000;
        brand = "드래곤볼";
    }

}
