package basics.data_structures.arrays.problema_soma;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");

        int n = scanner.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");

            numeros[i] = scanner.nextDouble();
        }

        System.out.print("\nVALORES = ");
        double soma = 0;

        for (int i = 0; i < n; i++) {
            double numero = numeros[i];
            soma += numero;

            System.out.print(numero + "  ");
        }

        System.out.printf("\nSOMA = %.2f%n",soma);
        System.out.printf("MÉDIA = %.2f%n", soma / n);
    }
}
