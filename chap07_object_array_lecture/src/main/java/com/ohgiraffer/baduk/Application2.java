package main.java.com.ohgiraffer.baduk;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){
        String baduk[][] = new String[19][19];

        for(int i = 0; i < baduk.length; i++){
            for(int j = 0; j < baduk[i].length; j++){
                baduk[i][j] = " ";
            }
        }
        int turn = 1;
        boolean test = true;
        Scanner scan = new Scanner(System.in);

        while (test) {
            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();
            }

            System.out.println(((turn % 2 == 0) ? "흑팀" : "백팀") + "의 차례입니다.");

            String[] index = scan.nextLine().split(" ");
            int first = Integer.parseInt(index[0]);
            int second = Integer.parseInt(index[1]);

            if (first < 0 || first >= baduk.length || second < 0 || second >= baduk[0].length) {
                System.out.println("잘못된 좌표입니다. 다시 시도하세요.");
                continue;
            }

            if (baduk[first][second].equals(" ")) {
                if (turn % 2 == 0) {
                    baduk[first][second] = "●";
                } else {
                    baduk[first][second] = "○";
                }
            } else {
                System.out.println("이미 돌이 놓여있는 자리입니다. 다시 시도하세요.");
                continue;
            }
            turn++;
        }
    }
}
