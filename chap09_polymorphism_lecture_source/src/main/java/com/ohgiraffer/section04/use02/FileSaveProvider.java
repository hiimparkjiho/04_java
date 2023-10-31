package main.java.com.ohgiraffer.section04.use02;

public class FileSaveProvider implements SaveProvider{
    @Override
    public boolean save(String data) {
        System.out.println("file save " + data);
        return false;
    }
}
