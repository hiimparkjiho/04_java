package main.java.com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args){
        A_if aif = new A_if();

        //aif.testSimpleIfStatement();

        B_ifElseIf bif = new B_ifElseIf();
        //bif.testSimpleIfElseIfStatement();
//        bif.test02();

        D_switch dSwitch = new D_switch();
        //dSwitch.testSimpleSwitchStatement();
        String result = dSwitch.test03();
        System.out.println(result);
    }
}
