package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args){
        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashcode: " + names.hashCode());

        // 매개 변수
        // 함수를 호출할 때 값을 전달하기 위해서 사용하는 변수이다.

//        print(names);
//        String[] animals = getAnimals();
//        System.out.println("리턴 받은 animals의 hashcode: " + animals.hashCode());
//
//        print(animals);
    }

//    public static void print(String[] args){
//
//        System.out.println("args의 hashcode: " + args.hashCode());
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i] + " ");
//        }
//        System.out.println();
//    }

    public static String[] getAnimals(){
        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};
        System.out.println("getAnimals의 hashcode: " + animals.hashCode());
        return animals;
    }
}
