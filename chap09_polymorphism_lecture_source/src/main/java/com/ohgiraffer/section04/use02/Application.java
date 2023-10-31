package main.java.com.ohgiraffer.section04.use02;

public class Application {
    public static void main(String[] args){
        Person person = new Person(new DatabaseSaveProvider());
        Person person1 = new Person(new FileSaveProvider());
        System.out.println(person1 instanceof Person);
        person1.doSomething();
        person.doSomething();
    }
}
