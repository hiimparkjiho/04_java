package main.java.com.ohgiraffer.Health;

public class Health {
    private String name;
    private int height;
    private int weight;

    public Health(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void toStatus(){
        System.out.print(name + "님의 신장은 : " + height +"cm 이고, 몸무게는 : " + weight + "kg 입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
