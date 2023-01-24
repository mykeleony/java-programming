package basics.recursion;

public class Test {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++)
            System.out.printf("%d! = %d%n", i, new Factorial().factorialOf(i));

        System.out.println("Alternative way: ");

        for (int i = 1; i <= 7; i++)
            System.out.printf("%d! = %d%n", i, new Factorial().alternativeFactorialOf(i));
    }
}
