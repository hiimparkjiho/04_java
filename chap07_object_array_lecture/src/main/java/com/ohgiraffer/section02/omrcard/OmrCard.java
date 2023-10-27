package main.java.com.ohgiraffer.section02.omrcard;

public class OmrCard {

    private String name;
    private int[] answer = new int[5];

    private String[] question = new String[5];

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
