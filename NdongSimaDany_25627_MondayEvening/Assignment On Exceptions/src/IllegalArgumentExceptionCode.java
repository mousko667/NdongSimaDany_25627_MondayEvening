public class IllegalArgumentExceptionCode {
    public IllegalArgumentExceptionCode() {
        try {
            int radius = -5;
            if (radius < 0) {
                throw new IllegalArgumentException("Radius cannot be negative.");
            }
            double area = Math.PI * radius * radius;
            System.out.println("Area of circle: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught. Invalid argument.");
        }
    }

    public static void main(String[] args) {
        new IllegalArgumentExceptionCode();
    }
}
