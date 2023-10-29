package main.java.com.ohgiraffer.section02.omrcard;

import java.util.Scanner;

public class OmrCardService {


    private int[] correctAnswer = new int[5];   // 진짜 정답

    // 진짜 정답을 '사용자'로부터 입력 받음 => 확장성을 위해서
    public void setCorrectAnswer(int a1, int a2, int a3, int a4, int a5) {
        this.correctAnswer[0] = a1;
        this.correctAnswer[1] = a2;
        this.correctAnswer[2] = a3;
        this.correctAnswer[3] = a4;
        this.correctAnswer[4] = a5;
    }

    // OMR CARD에 적힌 사람의 정보와 점수 출력
    public void printScore(OmrCard omrCard) {
        System.out.println("이름:" + omrCard.getName());
        System.out.println("학번:" + omrCard.getStudentId());

        int score = 0;
        for (int i = 0; i < correctAnswer.length; i++) {
            if (correctAnswer[i] == omrCard.getAnswer()[i]) {
                score += 100 / correctAnswer.length;
            }
        }

        System.out.println("점수:" + score);
    }
}
