package logicadeprogramacao;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers to be summed:");

        double value1 = scanner.nextInt();
        double value2 = scanner.nextInt();
        double valueSum = value1 + value2;

        System.out.println(value1 + " + " + value2 + " equals " + valueSum);
    }
}
