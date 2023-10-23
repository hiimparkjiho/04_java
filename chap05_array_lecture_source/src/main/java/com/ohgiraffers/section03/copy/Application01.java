package main.java.com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args){
        /*
        * 배열의 복사에는 크게 두 가지 종류가 있다.
        * 1. 얕은 복사(shallow copy) : stack의 주소 값만 복사
        * 2. 깊은 복사(deep copy) : heap의 배열에 저장된 값을 복사
        * */

        /*
        * 얉은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
        * 따라서 두 개의 래퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        * 하나의 래퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게된다.
        * 다른 래퍼런스 변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어있다.
        * */

        int[] originArr = {1,2,3,4,5};
        int[] copyArr = originArr;  // 얕은 복사 : 주소 값을 참조하고 있는 형태

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        //originArr[0] = 100;
        //System.out.println(copyArr[0]);

        for(int x:copyArr) {
            System.out.println(x);
        }

        int[] deepCopy = new int[originArr.length];
        int i = 0;
        for(int x : originArr){
            deepCopy[i] = x;
            i++;
        }

        deepCopy[0] = 100;
        System.out.println("originArr hashCode : " + originArr.hashCode());
        System.out.println("deepCopy hashCode: " + deepCopy.hashCode());
        System.out.println("originCopy[0] = " + originArr[0]);
        System.out.println("deepCopy[0] = " + deepCopy[0]);
//        for(int x:deepCopy){
//            System.out.println("deepCopy = " + x);
//        }
    }
}
