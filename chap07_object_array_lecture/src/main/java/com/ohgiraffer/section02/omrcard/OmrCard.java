package main.java.com.ohgiraffer.section02.omrcard;

public class OmrCard {

    private String name;
    private int studentId;
    private int[] answer = new int[5]; // 학생이 입력한 정답

    // 행위: 메소드
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
        this.answer[0] = a1;
        this.answer[1] = a2;
        this.answer[2] = a3;
        this.answer[3] = a4;
        this.answer[4] = a5;
    }

    public int[] getAnswer() {
        return answer;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }
}
