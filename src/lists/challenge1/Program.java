package lists.challenge1;

import java.util.*;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeArrayList = new ArrayList<Employee>();

        System.out.println("How many employees to add?");
        int employeeAmount = scanner.nextInt();

        IntStream.range(0, employeeAmount).forEach(i -> {
            int employeeId;
            String employeeName;
            double employeeSalary;
            System.out.println("Employee #" + (i + 1));
            System.out.println("Insert employee ID:");
            employeeId = scanner.nextInt();
            System.out.println("Insert employee name:");
            employeeName = scanner.next();
            System.out.println("Insert employee salary:");
            employeeSalary = scanner.nextDouble();

            Employee newEmployee = new Employee(
                    employeeId,
                    employeeName,
                    employeeSalary
            );

            employeeArrayList.add(newEmployee);
        });

        System.out.println("Employee List:");
        for (Employee employee : employeeArrayList) {
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getId());
            System.out.println("Salary: " + employee.getSalary());
        }

        System.out.println("Insert ID of employee to receive salary increase:");
        int employeeIDtoIncreaseSalary = scanner.nextInt();

        Employee employee = employeeArrayList
                .stream()
                .filter(x -> x.getId() == employeeIDtoIncreaseSalary)
                .findFirst()
                .orElse(null);
        if(employee == null) {
            System.out.println("This ID doe not exist!");
        } else {
            System.out.println("Insert percentage of salary increase:");
            double increasePercentage = scanner.nextDouble();

            employee.increaseSalaryByPercentage(increasePercentage);
        }

        System.out.println("Employee List:");
        for (Employee value : employeeArrayList) {
            employee = value;
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getId());
            System.out.println("Salary: " + employee.getSalary());
        }

    }
}
