package basics.data_structures.arrays.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");

        int n = scanner.nextInt();
        double[] numeros = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");

            double numero = scanner.nextDouble();

            numeros[i] = numero;
            soma += numero;
        }

        double media = soma / n;

        System.out.println("MÉDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");

        for (double numero : numeros) {
            if (numero < media) {
                System.out.printf("%.1f%n", numero);
            }
        }
    }
}
