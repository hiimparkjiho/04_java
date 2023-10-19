package main.java.com.ohgiraffer.section04.scanner;

public class StaticMethod {
    public static int plus(int a, int b){
        return (a + b);
    }

    public int priceSum(int tang, int mapa, int jj){
        return tang + mapa + jj;
    }

    public void money(int price){
        if(price >= 10000){
            System.out.println("과소비");
        }else if(price >= 5000){s
            System.out.println("검소한 식비입니다.");
        }else{
            System.out.println("굶는 중입니다.");
        }
    }

}


