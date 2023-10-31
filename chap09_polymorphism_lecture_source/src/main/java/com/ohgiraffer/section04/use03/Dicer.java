package main.java.com.ohgiraffer.section04.use03;

public class Dicer {
    private int currentPosition;

    public void throwDice(Dice dice){
        int diceNumer = dice.getNumber();
        move(diceNumer);
        System.out.println(currentPosition + " 만큼 이동하였습니다.");
    }

    public void move(int diceNumber){
        this.currentPosition += diceNumber;
    }
}
