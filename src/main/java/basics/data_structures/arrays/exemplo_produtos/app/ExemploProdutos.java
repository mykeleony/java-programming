package basics.data_structures.arrays.exemplo_produtos.app;

import basics.data_structures.arrays.exemplo_produtos.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ExemploProdutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Produto[] produtos = new Produto[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();

            produtos[i] = new Produto(nome, preco);
        }

        double somatorioPrecos = 0;

        for (int i = 0; i < n; i++) {
            somatorioPrecos += produtos[i].getPreco();
        }

        System.out.printf("Media de preços: %.2f%n", somatorioPrecos / n);

        scanner.close();
    }
}
