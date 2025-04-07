package basics.data_structures.arrays.aprovados.app;


import basics.data_structures.arrays.aprovados.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");

        int n = scanner.nextInt();
        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");

            String nome = scanner.nextLine();
            double primeiraNota = scanner.nextDouble();
            double segundaNota = scanner.nextDouble();

            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);
        }

        System.out.println("Alunos aprovados:");

        for (Aluno aluno : alunos) {
            double mediaNotas = (aluno.getPrimeiraNota() + aluno.getSegundaNota()) / 2.0;

            if (mediaNotas >= 6.0) {
                System.out.println(aluno.getNome());
            }
        }
    }
}
