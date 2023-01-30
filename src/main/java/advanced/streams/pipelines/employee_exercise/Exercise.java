package advanced.streams.pipelines.employee_exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
* Program that reads a salary input and prints the e-mail of all employees whose salary is greater than this salary.
* Also calculates the sum of salary of people whose name starts with "M". The employees information are accessed from a file.
*
* by Myke Amorim. 30/01/2023
* */
public class Exercise {

    public static void main(String[] args) {
        String filePath = "src/main/java/advanced/streams/pipelines/employee_exercise/Employees.txt";

        List<Employee> employees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        double minSalary = scanner.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(",");

                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.printf("Email of people whose salary is greater than $%.2f:%n", minSalary);
        employees.stream()
                .filter(e -> e.getSalary() > minSalary)
                .map(Employee::getEmail)
                .forEach(System.out::println);

        double sum = employees.stream()
                .filter(e -> e.getName().toUpperCase().startsWith("M"))
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.printf("Sum of salary of people whose name starts with 'M': $%.2f", sum);
    }

}
