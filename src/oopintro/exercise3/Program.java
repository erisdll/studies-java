package oopintro.exercise3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("INSERT STUDENT'S NAME AND GRADES");
        student.name = scanner.nextLine();
        student.firstGrade = scanner.nextDouble();
        student.secondGrade = scanner.nextDouble();
        student.thirdGrade = scanner.nextDouble();

        System.out.println(student.getFinalResultsMessage());
        scanner.close();
    }
}
