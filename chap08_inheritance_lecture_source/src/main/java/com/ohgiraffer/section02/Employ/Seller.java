package main.java.com.ohgiraffer.section02.Employ;

import main.java.com.ohgiraffer.section02.car.ElectricCar;
import main.java.com.ohgiraffer.section02.car.OldCar;

public class Seller {
    private String name;
    private int result; // 판매 수당

    public Seller(String name){
        this.name = name;
    }

//    public void sale(){
//
//    }

    public void oldCar(OldCar[] oldCar){
        for (OldCar car: oldCar) {
            result += car.getPrice();
        }
    }

    public void electricCar(ElectricCar[] car){
        for (ElectricCar electricCar: car) {
            result += electricCar.getPrice();
        }
    }

    @Override
    public String toString() {
        return name + "사원의 이번 달 월급은 + result " + result + '}';
    }
}
