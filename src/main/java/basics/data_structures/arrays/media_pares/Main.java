package basics.data_structures.arrays.media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");

        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");

            numeros[i] = scanner.nextInt();
        }

        int somaPares = 0;
        int qtdPares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
                qtdPares++;
            }
        }

        StringBuilder resultado = new StringBuilder("MÉDIA DOS PARES = ");

        if (qtdPares == 0) {
            resultado.append("NENHUM NÚMERO PAR");
        } else {
            double mediaPares = (double) somaPares / qtdPares;

            resultado.append(String.format("%.1f", mediaPares));
        }

        System.out.println(resultado);
    }
}
