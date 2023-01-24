package intermediates.util_classes;

public class MathExamples {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 2));

        // Rounding numbers
        System.out.println(Math.round(5.6));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.4));
        System.out.println(Math.ceil(4.1));     // Always above
        System.out.println(Math.floor(4.9));    // Always down

        // Generates double random values
        System.out.println(Math.round(Math.random() * 100));

        System.out.println(Math.sin(Math.toRadians(30)));
        System.out.println(Math.cos(Math.toRadians(1)));
        System.out.println(Math.tan(Math.toRadians(45)));
    }
}
