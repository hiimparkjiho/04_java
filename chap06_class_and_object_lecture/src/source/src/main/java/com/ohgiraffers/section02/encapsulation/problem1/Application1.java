package source.src.main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args){
        Monster monster = new Monster();
        //System.out.println(monster.hashCode());
        monster.name = "두치";    // 93122545.name
        monster.hp = 200;       // 93122545.hp

        System.out.println("monster name : " + monster.name);
        System.out.println("monster hp : " + monster.hp);

        Monster monster2 = new Monster();
        // monster2 //940553268
        //System.out.println(monster2.hashCode());
        monster2.name = "뿌꾸";   //940553268.name
        monster2.hp = -200;     //940553268.hp
        System.out.println("monster2 name: " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);
        // /u0-------

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3의 name : " + monster3.name);
        System.out.println("monster3의 hp : " + monster3.hp);

        Monster monster4  = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4의 name : " + monster4.name);
        System.out.println("monster4의 hp : " + monster4.hp);
    }
}
