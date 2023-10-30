package main.java.com.ohgiraffer.section02.car;

public class ElectricCar extends Car{
    private String carName;

    private String energy;

    public ElectricCar(String brand, int price, String carName, String energy) {
        super(brand, price);
        this.carName = carName;
        this.energy = energy;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "carName='" + carName + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
