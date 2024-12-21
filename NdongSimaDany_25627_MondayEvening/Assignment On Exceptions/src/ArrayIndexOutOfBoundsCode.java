public class ArrayIndexOutOfBoundsCode {
    public ArrayIndexOutOfBoundsCode() {
        try {
            int[] array = new int[1];
            int number = array[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught. Index out of bounds.");
        }
    }

    public static void main(String[] args) {
        new ArrayIndexOutOfBoundsCode();
    }
}
