package main.java.com.ohgiraffers.understand;

public enum HType {
    // 벌크업 , 감량, 다이어트, 요가, 유령
    벌크업(100, -40),
    감량(70, -20),
    다이어트(50, -10),
    요가(30, 20),
    유령(30, 0);

    int cache;
    int damage;

    HType(int cache, int damage) {
        this.cache = cache;
        this.damage = damage;
    }
}
