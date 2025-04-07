package basics.data_structures.arrays.problema_negativos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número inteiro: ");

            numeros[i] = scanner.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int i = 0; i < n; i++) {
            int numeroAtual = numeros[i];

            if (numeroAtual < 0) {
                System.out.println(numeroAtual);
            }
        }

        scanner.close();
    }
}
