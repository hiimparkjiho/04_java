package main.java.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args){
        /*
        * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을 또 다른 배열에 복사를 해놓은 것이다.
        * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에 하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
        * */

        /*
        * 깊은 복사를 하는 방법은 4가지가 있다.
        * 1. for문을 이용한 동일 인덱스 값 복사
        * 2. Object의 clone을 이용한 복사
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Arrays의 copyOf()를 이용한 복사
        * 이중 가장 높은 성능 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy() 메소드이며
        * 가장 많이 사용되는 방식인 copyOf() 메소드이다.
        * clone()의 경우 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 갖는다.
        * */

        int[] originArr = new int[] {1,2,3,4,5};
        print(originArr);

        // for문을 이용한 동일 인덱스 값 복사
        int[] copyArr1 = new int[10];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        // Object의 clone을 이용한 복사
        int[] copyArr2 = originArr.clone();
        print(copyArr2);

        // System의 arrayCopy를 이용한 복사
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        print(copyArr3);

        // Arry의 copyOf를 이용한 복사
        int[] copArr4 = Arrays.copyOf(originArr,7);
        print(copArr4);

    }
    public static void print(int[] iarr){
        System.out.println("iarr의 hashcode : " + iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");
        }
        System.out.println();
    }
}
