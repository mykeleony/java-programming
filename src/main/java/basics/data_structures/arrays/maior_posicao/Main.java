package basics.data_structures.arrays.maior_posicao;

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

        double maior = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            double numero = numeros[i];

            if (numero > maior) {
                maior = numero;
                posicaoMaior = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaior);
    }
}
