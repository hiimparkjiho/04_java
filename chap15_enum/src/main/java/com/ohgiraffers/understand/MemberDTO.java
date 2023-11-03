package main.java.com.ohgiraffers.understand;

public class MemberDTO {
    private String name;
    private int weight;
    private HType type;

    public MemberDTO(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public HType getType() {
        return type;
    }

    public void setType(HType type) {
        this.type = type;
    }
}
