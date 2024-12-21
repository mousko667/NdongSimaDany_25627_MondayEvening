import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOE_ExceptionCode {
    public IOE_ExceptionCode() {
        try (BufferedReader reader = new BufferedReader(new FileReader("LekuDeTonBoss.txt"))) {
            String Lekon = reader.readLine();
            System.out.println("File content: " + Lekon);
        } catch (IOException e) {
            System.out.println("IOException. File not readable.");
        }
    }

    public static void main(String[] args) {
        new IOE_ExceptionCode();
    }
}
