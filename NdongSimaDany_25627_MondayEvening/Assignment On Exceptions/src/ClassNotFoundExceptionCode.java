public class ClassNotFoundExceptionCode {
    public ClassNotFoundExceptionCode() {
        try {
            Class.forName("ClassDuku.non.existent");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught. Class not found.");
        }
    }

    public static void main(String[] args) {
        new ClassNotFoundExceptionCode();
    }
}
