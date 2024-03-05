package vectors.negatives;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers to type?");
        int cardinality = scanner.nextInt();
        int[] myVector = new int[cardinality];

        IntStream.range(0, myVector.length).forEach(index -> {
            System.out.println("Type a Number:");
            myVector[index] = scanner.nextInt();
        });

        System.out.println("Negative Numbers:");
        for(int index : myVector) {
            if (index < 0) {
                System.out.println(index);
            }
        }

        scanner.close();
    }
}
