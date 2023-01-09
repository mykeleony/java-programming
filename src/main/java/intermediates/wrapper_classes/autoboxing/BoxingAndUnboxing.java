package intermediates.wrapper_classes.autoboxing;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        // Autoboxing. Boxing is the act of assigning a primitive type into a class type.
        Integer i1 = 1;

        // Autounboxing.
        int i2 = i1;

        // Autoboxing within expressions
        System.out.println(++i1);

        /* Wrong use */
        Double d1 = 8.0, d2 = 8.0, d3 = 8.0;

        Double avg = (d1 + d2 + d3) / 3.0;

        // When using a lot of expressions, it is better to use primitive types.
        System.out.println(avg);
    }
}
