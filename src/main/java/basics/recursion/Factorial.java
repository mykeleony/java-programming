package basics.recursion;

public class Factorial {
    public int result = 1;

    public int factorialOf(int n) {
        if (n > 1) {
            result *= n;

            factorialOf(--n);
        }

        return result;
    }

    public int alternativeFactorialOf(int n) {
        if (n == 0)
            return 1;

        return n * alternativeFactorialOf(n - 1);
    }
}
