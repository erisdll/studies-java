package oopintro.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Insert rectangle side lengths:");

        rectangle.length = scanner.nextDouble();
        rectangle.width = scanner.nextDouble();

        System.out.println("AREA: " + rectangle.calcArea());
        System.out.println("PERIMETER: " + rectangle.calcPerimeter());
        System.out.println("DIAGONAL: " + rectangle.calculateDiagonal());
    }
}
