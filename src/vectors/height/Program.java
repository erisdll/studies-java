package vectors.height;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people to add?");
        int cardinality = scanner.nextInt();
        Person[] peopleVector = new Person[cardinality];

        System.out.println("Insert Data:");

        IntStream.range(0, peopleVector.length).forEach(index -> {
            System.out.println("Name:");
            String name = scanner.next();
            System.out.println("Age:");
            int age = scanner.nextInt();
            System.out.println("Height:");
            double height = scanner.nextDouble();
            peopleVector[index] = new Person(name, age, height);
        });

        double heightSum = 0;
        for (Person person : peopleVector) {
            heightSum += person.getHeight();
        }
        System.out.println("Average Height: " + (heightSum / peopleVector.length*100) / 100.0);

        int minorsCounts = 0;
        for (Person person : peopleVector) {
            if (person.getAge() < 16) {
                minorsCounts++;
                System.out.println(
                        "Name: " + person.getName() +
                        "\n Age: " + person.getAge() +
                        "\n Height: " + person.getHeight()
                        );
            }
        }

        double percentageOfMinors = (double) minorsCounts / peopleVector.length * 100;
        System.out.println("Percentage of minors under 16: " + percentageOfMinors);

        scanner.close();
    }
}
