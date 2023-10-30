package main.java.com.ohgiraffer.section02;

import main.java.com.ohgiraffer.section02.Employ.Seller;
import main.java.com.ohgiraffer.section02.car.ElectricCar;
import main.java.com.ohgiraffer.section02.car.OldCar;

public class Application {
    public static void main(String[] args){
        System.out.println("자동차 판매 프로그램입니다.");
        System.out.println("전기차");
        ElectricCar ionic = new ElectricCar("H", 1000, "ionic1", "1000km");
        ElectricCar ionic2 = new ElectricCar("H", 1500, "ionic1", "1500km");
        ElectricCar ionic3 = new ElectricCar("H", 2000, "ionic1", "2000km");
        ElectricCar kona = new ElectricCar("H", 2100, "ionic1", "2100km");

        System.out.println("내연기관 자동차");

        OldCar porter = new OldCar("H", 1500, "porter", "diesel");
        OldCar avante = new OldCar("H", 1500, "avante", "gasoline");
        OldCar sonata = new OldCar("H", 2000, "sonate", "diesel");

        System.out.println("영업사원이 입사했습니다");
        Seller seller = new Seller("노홍철");
        //seller.electricCar();


    }
}
