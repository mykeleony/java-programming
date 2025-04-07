package basics.data_structures.arrays.mais_velho.app;

import basics.data_structures.arrays.mais_velho.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");

        int n = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            pessoas[i] = new Pessoa(nome, idade);
        }

        Pessoa pessoaMaisVelha = new Pessoa("", 0);

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > pessoaMaisVelha.getIdade()) {
                pessoaMaisVelha = pessoa;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha.getNome());
    }
}
