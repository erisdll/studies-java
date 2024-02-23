package oopintro.exercise2;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        double netSalary = grossSalary - tax;
        return ((netSalary * 100)/100.00);
    }

    public void increaseSalary(double percentage) {
        grossSalary = grossSalary + (grossSalary * (percentage / 100));
    }
}
