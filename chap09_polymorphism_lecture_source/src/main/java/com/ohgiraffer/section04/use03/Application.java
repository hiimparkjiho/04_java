package main.java.com.ohgiraffer.section04.use03;

public class Application {
    public static void main(String[] args){
        Dicer dicer = new Dicer();
        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());
    }
}
