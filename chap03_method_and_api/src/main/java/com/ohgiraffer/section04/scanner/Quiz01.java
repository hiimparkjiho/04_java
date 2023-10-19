package main.java.com.ohgiraffer.section04.scanner;

public class Quiz01 {
    public static void main(String[] args) {
        int age = 30;
        String personName = "김과장";
        Quiz02 quiz02 = new Quiz02();

        String result = quiz02.isAdult(age, personName);
        System.out.println("환영합니다, " + result + " 회원 " + personName + " 님!");
    }

}
