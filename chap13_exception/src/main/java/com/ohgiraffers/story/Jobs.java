package main.java.com.ohgiraffers.story;

public class Jobs {
    private int num;
    private String jonName;

    public Jobs(int num, String jonName) {
        this.num = num;
        this.jonName = jonName;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "num=" + num +
                ", jonName='" + jonName + '\'' +
                '}';
    }
}
