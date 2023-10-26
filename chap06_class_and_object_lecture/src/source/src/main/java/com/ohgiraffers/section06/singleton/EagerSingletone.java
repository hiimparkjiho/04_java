package source.src.main.java.com.ohgiraffers.section06.singleton;

public class EagerSingletone {

    private static EagerSingletone eager = new EagerSingletone();

    private EagerSingletone(){
        System.out.println("eager 실행됨");
    }

    public static EagerSingletone getInstance(){
        return eager;   //
    }
}
