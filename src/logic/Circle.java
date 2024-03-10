package logic;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius (cm) a the circle:");

        double circleRadius = scanner.nextInt();
        double circleArea = Math.PI * circleRadius * circleRadius;

        System.out.println("The area of the circle of radius " + circleRadius + "cm is: " + circleArea + "cm.");
    }
}
