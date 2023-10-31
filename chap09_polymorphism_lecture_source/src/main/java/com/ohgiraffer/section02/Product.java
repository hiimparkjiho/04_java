package main.java.com.ohgiraffer.section02;

public abstract class Product {
    public Product(){

    }

    public void nonStatucMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }

    public static void startMethod(){
        System.out.println("Product 클래스의 Static Method");
    }

    // 유통기한
    public abstract void abstractMethod();  // 함수의 몸체를 구현하지 않고 자식 클래스가 무조건 정의하도록 하는 것

}
