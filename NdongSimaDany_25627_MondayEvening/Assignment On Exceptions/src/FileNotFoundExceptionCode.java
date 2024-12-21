import java.io.FileInputStream;

public class FileNotFoundExceptionCode {
    public FileNotFoundExceptionCode() {
        try {
            FileInputStream file = new FileInputStream("LekuDeTaDaronne.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException. File not found.");
        }
    }

    public static void main(String[] args) {
        new FileNotFoundExceptionCode();
    }
}
