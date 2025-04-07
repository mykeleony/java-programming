package basics.data_structures.arrays.numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");

        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");

            numeros[i] = scanner.nextInt();
        }

        int qtdPares = 0;
        System.out.println("\nNÚMEROS PARES: ");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");

                qtdPares++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + qtdPares);
    }
}
