package intermediates.varargs.with_varargs;

public class VarargsExample {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    // Varargs parameter must be the last one
    private static int sum(Integer... numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum;
    }

}
