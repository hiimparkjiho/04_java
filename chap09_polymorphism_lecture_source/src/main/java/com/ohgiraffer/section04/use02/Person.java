package main.java.com.ohgiraffer.section04.use02;

public class Person {

    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider){
        this.saveProvider = saveProvider;
    }

    public void doSomething(){
        String date = "string data";
        saveProvider.save(date);
    }
}
