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
        }else if(price >= 5000){
            System.out.println("검소한 식비입니다.");
        }else{
            System.out.println("굶는 중입니다.");
        }
    }

    public void calculation(double calc1, double calc2, String sign){
        if(sign.equals("+")){
            System.out.println("값은 " + (int)(calc1 + calc2));
        }else if(sign.equals("-")){
            System.out.println("값은 " + (int)(calc1 - calc2));
        }else if(sign.equals("*")){
            System.out.println("값은 " + (int)(calc1 * calc2));
        }else if(sign.equals("/")){
            System.out.println("값은 " + (calc1 / calc2));
        }else{
            System.out.println("기호를 확인해주세요");
        }
    }

}


