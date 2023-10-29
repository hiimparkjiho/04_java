package main.java.com.ohgiraffer.section02.omrcard;

public class Application {
    public static void main(String[] args) {
        // OMR 카드 입력
        OmrCard omrCard = new OmrCard();
        omrCard.setStudentId(20200302);
        omrCard.setName("박지호");
        omrCard.setAnswer(3, 3, 4, 5, 1);

        // OMR 카드 읽기
        OmrCardService omrCardService = new OmrCardService();
        // 정답 입력
        omrCardService.setCorrectAnswer(3, 3, 4, 4, 1);
        // OMR 카드 입력 후 결과 확인
        omrCardService.printScore(omrCard);
    }
}
