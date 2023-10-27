package main.java.com.ohgiraffer.baduk;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args){

        String[][] baduk = new String[10][10];

        for (int i = 0; i < baduk.length; i++) {
            for (int j=0; j < baduk[i].length; j++){
                baduk[i][j] = " ";  // 배열이 공백으로 초기화된다.
            }
        }
        boolean test = true;    // 무한루프
        Scanner scanner = new Scanner(System.in);   // 바둑돌을 놓기 위해 사용하는 스캐너
        int turn = 1;   // int로 턴을 선언

        while (test){
            System.out.println( ((turn%2==0)? "흑팀" : "백팀") + " 님 차례입니다.");
            String[] index = scanner.nextLine().split(" "); // " " 공백을 기점으로 0번 인덱스와 1번 인덱스로 나눈다는 뜻.
            int first = Integer.parseInt(index[0]); // Integer int의 차이는 Integer는 null을 포함할 수 있다.
            int second = Integer.parseInt(index[1]);    // first는 0번 인덱스, second는 1번 인덱스로 선언

            if(turn % 2 == 0){
                if(baduk[first][second].equals(" ")){
                    baduk[first][second] = "●"; // 흑팀의 차례에 바둑돌이 없는 곳에 돌을 넣으면 배치된다.
                }else{
                    System.out.println(((turn%2==0)? "흑팀" : "백팀") + " 님 차례입니다.");
                    continue;   // 그렇지 않을 경우에 턴을 건너뛰고 다시 돌아온다.
                }
            }else{
                if(baduk[first][second].equals(" ")){
                    baduk[first][second] = "○"; // 백팀의 차례에 돌이 배치되지 않은 곳에 돌을 배치
                }else{
                    System.out.println(((turn%2==0)? "흑팀" : "백팀") + " 님 차례입니다.");
                    continue;   // 돌을 중복되서 배치한 경우에 턴이 무효회된 후 다시 돌아온다.
                }
            }

            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j=0; j < baduk[i].length; j++){
                    System.out.print(baduk[i][j] + "|");    // 바둑판 배치
                }
                System.out.println();
            }
            turn++; // 증감연산자로 턴을 진행한다.
        }

    }
}
