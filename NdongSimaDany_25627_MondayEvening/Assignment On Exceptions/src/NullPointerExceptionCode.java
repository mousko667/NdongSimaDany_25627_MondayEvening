public class NullPointerExceptionCode {
    public NullPointerExceptionCode() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught. Null object accessed.");
        }
    }

    public static void main(String[] args) {
        new NullPointerExceptionCode();
    }
}
