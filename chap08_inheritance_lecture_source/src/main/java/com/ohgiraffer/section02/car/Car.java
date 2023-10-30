package main.java.com.ohgiraffer.section02.car;

public class Car {
    // 현대차
    private final String brand;
    private int price;

    public Car(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getBrand(){
        return this.brand;
    }
}
