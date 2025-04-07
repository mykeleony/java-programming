package basics.data_structures.arrays.dados_pessoas.app;

import basics.data_structures.arrays.dados_pessoas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");

        int n = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        int qtdHomens = 0;
        int qtdMulheres = 0;
        double somaAlturasMulheres = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double altura = scanner.nextDouble();

            System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
            char genero = scanner.next().charAt(0);

            if (genero == 'M') {
                qtdHomens++;
            } else {
                qtdMulheres++;
                somaAlturasMulheres += altura;
            }

            pessoas[i] = new Pessoa(altura, genero);
        }

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = 0;

        for (Pessoa pessoa : pessoas) {
            double altura = pessoa.getAltura();

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f%n", somaAlturasMulheres / qtdMulheres);
        System.out.println("Número de homens = " + qtdHomens);
    }
}
