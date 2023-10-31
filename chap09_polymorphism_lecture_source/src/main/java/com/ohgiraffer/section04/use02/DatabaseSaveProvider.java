package main.java.com.ohgiraffer.section04.use02;

public class DatabaseSaveProvider implements SaveProvider{
    @Override
    public boolean save(String data) {
        System.out.println("data save " + data);
        return false;
    }
}
