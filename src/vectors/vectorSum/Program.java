package vectors.vectorSum;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers to type?");
        int cardinality = scanner.nextInt();
        double[] myVector = new double[cardinality];

        IntStream.range(0, myVector.length).forEach(index -> {
            System.out.println("Type a Number:");
            myVector[index] = scanner.nextInt();
        });

        double sum = 0;
        for(double index : myVector) {
            sum += index;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/cardinality);
        scanner.close();
    }
}
