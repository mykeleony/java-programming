package basics.data_structures.arrays.soma_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
}
