package source.src.main.java.com.ohgiraffers.section06.singleton;

public class LazySingletone {
    private static LazySingletone lazy;

    private LazySingletone(){
        System.out.println("lazy 생성 됨");
    }

    public static LazySingletone getInstance(){
        if(lazy == null){
            System.out.println("lazy가 null인 상태");
            lazy = new LazySingletone();
            return lazy;
        }
        System.out.println("lazy가 널이 아닌 상태");
        return lazy;
    }
}
