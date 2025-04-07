package basics.data_structures.arrays.problema_alturas.app;

import basics.data_structures.arrays.problema_alturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Serão digitadas quantas pessoas? ");

        int n = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            System.out.println("Dados da " + (i + 1) + "a pessoa: ");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAlturas = 0;
        String[] nomesMenores = new String[n];
        int qtdMenores = 0;

        for (int i = 0; i < n; i++) {
            Pessoa pessoa = pessoas[i];

            somaAlturas += pessoa.getAltura();

            if (pessoa.getIdade() < 16) {
                nomesMenores[i] = pessoa.getNome();
                qtdMenores++;
            }
        }

        System.out.printf("%nAltura média: %.2f%n", somaAlturas / n);

        double porcentagemMenores = ((double) qtdMenores / n) * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenores);

        for (String nome : nomesMenores) {
            if (nome != null) {
                System.out.println(nome);
            }
        }
    }
}
