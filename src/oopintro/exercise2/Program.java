package oopintro.exercise2;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Insert employee's name, gross salary and tax:");
        employee.name = scanner.nextLine();
        employee.grossSalary = scanner.nextDouble();
        employee.tax = scanner.nextDouble();

        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        System.out.println("Which percentage to increase salary?");
        employee.increaseSalary(scanner.nextDouble());
        System.out.println("Updated data: " + employee.name + ", $ " + employee.netSalary());
    }
}
