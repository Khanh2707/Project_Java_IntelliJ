import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.getAbsoluteFile());
    }
}