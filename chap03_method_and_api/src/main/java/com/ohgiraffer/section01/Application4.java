package main.java.com.ohgiraffer.section01;

public class Application4 {
    public static void main(String[] args){
        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 26, '남');
        String name = "박지호";
        int age = 26;
        char gender = '남';
        app4.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender){
        System.out.println("당신의 이름은 " + name + " 당신의 나이는 " + age + " 당신의 성별은 " + gender);
    }

    public void info100(String name, int age, final String gender){
        name = name + 100;
        age = age * 100;
        //gender = gender + "100";
        System.out.println("당신의 이름은 " + name + " 당신의 나이는 " + age + " 당신의 성별은 " + gender);
    }
}
