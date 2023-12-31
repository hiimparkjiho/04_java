package main.java.com.ohgiraffer.section01.object.run;

import main.java.com.ohgiraffer.section01.object.book.Book;

public class Application02 {
    public static void main(String[] args){
        /*
        * equals() 메서드 오버라이딩
        * equals 메서드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다.
        * 즉 동일한 인스턴스인지를 비교하는 기능을 한다.
        *
        * 동일객체와 동등객체
        * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
        * 동등객체 : 주소는 다르더라도 필드 값이 동일한 객체를 동등객체라고 한다.
        * */

        Book book = new Book(1, "홍길동전", "허균", 5000);
        Book book1 = new Book(2, "목민심서", "정약용", 5000);
        Book book2 = new Book(2, "목민심서", "정약용", 5000);
        Book book3 = book;
        Application02 app = new Application02();

        System.out.println("동일 객체 비교하기 " + (book == book3));
        System.out.println("동등 객체 비교하기 " + (book1.equals(book2)));
        System.out.println("다른 객체 비교하기 " + (book1 == book3));
        //System.out.println("다른 형식의 객체 비교 " + (book1.equals(app)));
    }
}
