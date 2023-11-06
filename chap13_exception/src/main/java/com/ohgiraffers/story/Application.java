package main.java.com.ohgiraffers.story;

public class Application {
    public static void main(String[] args){
        /*
        * 개발 관련 목표가 없던 박지호
        * 그는 강사에게 과제를 받았다.
        * 과제는 job에 대한 조사를 하는 것이다.
        * 생각보다 직업이 많아서 고민을 하던 박지호
        * 배열을 가지고 직업 리스트를 만들기로 하였다.
        * */
    
        // 처음 개발 관련 직군이 몇개가 있는지 모르는 박지호
        // ArrayList를 사용하는 것이 아직은 익숙하지 않아
        // 상대적으로 접근하기 쉬운 배열을 사용
        Jobs[] jobList = new Jobs[5];

        try{    // 발생될 수 있는 예외를 묶어줌
            jobList[0] = new Jobs(1, "백엔드");
            jobList[1] = new Jobs(2, "프론트엔드");
            jobList[2] = new Jobs(3, "데브옵스");
            jobList[3] = new Jobs(4, "DBA");
            jobList[4] = new Jobs(5, "PM");
            // ArrayIndexOutOfBoundsException이 발생됨에 따라서 프로그램 동작을 멈춤
            jobList[5] = new Jobs(6, "PL");
            jobList[6] = new Jobs(7, "BigData");
        }
        catch(ArrayIndexOutOfBoundsException e){   // catch는 에러가 발생되면 처리하게 해준다.
            e.printStackTrace();
        }finally {  // 반드시 실행됨
            System.out.println("실행완료");
        }
        
        for(int i = 0; i < jobList.length; i++){
            System.out.println(jobList[i]);
        }

    }
}
