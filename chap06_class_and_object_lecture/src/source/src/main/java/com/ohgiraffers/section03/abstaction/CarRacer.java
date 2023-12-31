package source.src.main.java.com.ohgiraffers.section03.abstaction;

public class CarRacer {
    private final Car car = new Car();
    //private Car car;

    /*
    * this.car의 시동을 거는 메소드
    * @return void
    * */
    public void startUp(){
        car.startUp();
    }

    /*
    * this.car의 메서드를 호출하여 앞으로 가는 기능
    * @return void
    * */
    public void stepAccelator(){
        car.go();
    }

    /*
    * this.car의 stop메소드를 호출하여 자동차를 멈춘다.
    * */
    public void setUpBreak(){
        car.stop();
    }

    /*
    * this.car의 turnOff라는 메소드를 호출하여 시동을 끈다.
    * */
    public void turnOff(){
        car.turnOff();
    }
}
