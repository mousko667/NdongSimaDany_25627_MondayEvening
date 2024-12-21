import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL_ExceptionCode {
    public SQL_ExceptionCode() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistent_db", "Leku", "LekuDukon1.");
        } catch (SQLException e) {
            System.out.println("SQLException caught: Database connection issue.");
        }
    }

    public static void main(String[] args) {
        new SQL_ExceptionCode();
    }
}
