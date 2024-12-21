import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EOF_ExceptionCode {
    public EOF_ExceptionCode() {
        try {
            InputStream input = new FileInputStream("LekuDukon.txt");
            input.read();
        } catch (EOFException e) {
            System.out.println("EOFException caught: Unexpected end of file.");
        } catch (IOException e) {
            System.out.println("IOException caught.");
        }
    }

    public static void main(String[] args) {
        new EOF_ExceptionCode();
    }
}
