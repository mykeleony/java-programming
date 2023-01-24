package basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        int withoutDecimals = (int) amount;

        int b100 = withoutDecimals / 100;
        withoutDecimals -= b100 * 100;

        int b50 = withoutDecimals / 50;
        withoutDecimals -= b50 * 50;

        int b20 = withoutDecimals / 20;
        withoutDecimals -= b20 * 20;

        int b10 = withoutDecimals / 10;
        withoutDecimals -= b10 * 10;

        int b5 = withoutDecimals / 5;
        withoutDecimals -= b5 * 5;

        int b2 = withoutDecimals / 2;
        withoutDecimals -= b2 * 2;

        int c1 = withoutDecimals;
        withoutDecimals -= c1;

        amount -= (int) amount;
        amount = amount * 100;

        int c050 = (int) (amount / 50);
        amount -= c050 * 50;

        int c025 = (int) (amount / 25);
        amount -= c025 * 25;

        int c010 = (int) (amount / 10);
        amount -= c010 * 10;

        int c005 = (int) (amount / 5);
        amount -= c005 * 5;

        int c001 = (int) amount;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", b100);
        System.out.printf("%d nota(s) de R$ 50.00%n", b50);
        System.out.printf("%d nota(s) de R$ 20.00%n", b20);
        System.out.printf("%d nota(s) de R$ 10.00%n", b10);
        System.out.printf("%d nota(s) de R$ 5.00%n", b5);
        System.out.printf("%d nota(s) de R$ 2.00%n", b2);
        System.out.println("MOEDAS:");
        System.out.println(c1 + " moeda(s) de R$ 1.00");
        System.out.println(c050 + " moeda(s) de R$ 0.50");
        System.out.println(c025 + " moeda(s) de R$ 0.25");
        System.out.println(c010 + " moeda(s) de R$ 0.10");
        System.out.println(c005 + " moeda(s) de R$ 0.05");
        System.out.println(c001 + " moeda(s) de R$ 0.01");
    }
}