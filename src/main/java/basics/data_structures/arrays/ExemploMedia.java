package basics.data_structures.arrays;

import java.util.Scanner;

public class ExemploMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Insira a altura: ");

            alturas[i] = scanner.nextDouble();
        }

        double somatorioAlturas = 0;

        for (int i = 0; i < n; i++) {
            somatorioAlturas += alturas[i];
        }

        System.out.printf("Média de alturas: %.2fcm%n", somatorioAlturas / n);

        scanner.close();
    }
}
