package main.java.com.ohgiraffer.Health;

public class StandartWeightTest extends Health{
    //표준체중:SW=(H-100)*0.9
    //비만도: B(%)=(W-SW)/SW * 100
    //(비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
    private double standardWeight;
    private double ovesity;
    public StandartWeightTest(String name, int height, int weight) {
        super(name, height, weight);
    }

    public double getStandardWeight(){  // 표준체중 계산
        return (super.getHeight() - 100) * 0.9;
    }

    public double getOvesity(){ // 비만도 계산
        return (super.getWeight() - getStandardWeight()) / getStandardWeight() * 100;
    }

    public String status(){ // 비만도 검사
        if(getOvesity() < 10){
            return "정상";
        }else if(getOvesity() >= 10 && getOvesity() < 20){
            return "과체중";
        }else{
            return "비만";
        }
    }

    @Override
    public void toStatus() {// 오버라이드로 재정의
        super.toStatus();
        System.out.println("=>" + status() + "입니다");
    }
}
