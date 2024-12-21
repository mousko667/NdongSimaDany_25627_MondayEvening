public class ArithmeticExceptionCode {
    public ArithmeticExceptionCode() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero.");
        }
    }

    public static void main(String[] args) {
        new ArithmeticExceptionCode();
    }
}
