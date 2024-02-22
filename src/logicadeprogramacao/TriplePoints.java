package logicadeprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class TriplePoints {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert three numeric values:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        double triangleArea = (a * c)/2;
        double circleArea = Math.PI * Math.pow(c, 2);
        double trapezoidArea = ((a + b)/2) * c;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a * b;

        System.out.println("TRIANGLE: " + triangleArea);
        System.out.println("CIRCLE: " + circleArea);
        System.out.println("TRAPEZOID: " + trapezoidArea);
        System.out.println("SQUARE: " + squareArea);
        System.out.println("RECTANGLE: " + rectangleArea);
    }
}
