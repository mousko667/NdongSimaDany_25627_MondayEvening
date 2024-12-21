public class ClassCastExceptionCode {
    public ClassCastExceptionCode() {
        try {
            Object obj = 10;
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught. Invalid type casting.");
        }
    }

    public static void main(String[] args) {
        new ClassCastExceptionCode();
    }
}
