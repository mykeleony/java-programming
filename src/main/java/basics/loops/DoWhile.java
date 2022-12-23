package basics.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int age = 1;
        String name;

        Scanner scanner = new Scanner(System.in);

        // Executes and checks, not checks and exw.
        do {
            System.out.println("What is your name?");
            name = scanner.nextLine();

            System.out.println("Ok. What is your age?");
            age = Integer.parseInt(scanner.nextLine());

            System.out.println(name + " is " + age + " years old");
        } while (age > 0);

    }
}
