package vectors.vectorIndexSum;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements will each vector have? ");
        int cardinality = scanner.nextInt();

        int[] firstVector = new int[cardinality];
        int[] secondVector = new int[cardinality];
        int[] resultingVector = new int[cardinality];

        System.out.println("Type first vector's elements: ");
        for(int i = 0; i < firstVector.length; i++) {
            firstVector[i] = scanner.nextInt();
        }

        System.out.println("Type second vector's elements: ");
        for(int i = 0; i < secondVector.length; i++) {
            secondVector[i] = scanner.nextInt();
        }

        for(int i = 0; i < resultingVector.length; i++) {
            resultingVector[i] = firstVector[i] + secondVector[i];
        }

        System.out.println("Resulting Vector: ");
        for (int value : resultingVector) {
            System.out.println(value);
        }
    }
}
