package matrices.exercise1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert matrix size: ");
        int size = scanner.nextInt();
        Integer[][] matrix = new Integer[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print("Insert element at position [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (Integer[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        int numberOfNegatives = 0;
        for (Integer[] row : matrix) {
            for (Integer value : row) {
                if (value < 0) {
                    numberOfNegatives++;
                }
            }
        }

        System.out.println("Amount of negative numbers is: " + numberOfNegatives);
    }
}
