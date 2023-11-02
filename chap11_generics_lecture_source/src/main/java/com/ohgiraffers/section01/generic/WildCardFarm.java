package main.java.com.ohgiraffers.section01.generic;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    public void extendsType (RabbitFarm<? extends Bunny> faram){
        faram.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
