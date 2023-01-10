package intermediates.string_manipulation;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String test = "This is a test.";

        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        if (test.toLowerCase().equals(test.toLowerCase()))
            System.out.println("ok");

        else
            System.out.println("not ok");
    }
}
