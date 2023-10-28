package main.java.com.ohgiraffer.section02.omrcard;

public class OmrCard {

    private String name;
    private int[] answer = new int[5];

    private String[] question = new String[5];

    private int[] correctAnswer = new int[5];   // 진짜 정답

    // 진짜 정답을 '사용자'로부터 입력 받음 => 확장성을 위해서
    public void setCorrectAnswer(int a1, int a2, int a3, int a4, int a5) {
        this.correctAnswer[0] = a1;
        this.correctAnswer[1] = a2;
        this.correctAnswer[2] = a3;
        this.correctAnswer[3] = a4;
        this.correctAnswer[4] = a5;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getAnswer() {
        return answer;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }

    public String[] getQuestion() {
        return question;
    }

    public void setQuestion(String[] question) {
        this.question = question;
    }
}
