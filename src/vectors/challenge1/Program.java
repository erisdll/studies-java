package vectors.challenge1;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] arguments) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hotel Size?");
        int hotelSize = scanner.nextInt();
        Renter[] hotel = new Renter[hotelSize];

        System.out.println("How many rents?");
        int rentsAmount = scanner.nextInt();

        for (int i = 0; i < rentsAmount; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Email: ");
            String email = scanner.next();
            System.out.println("room: ");
            int room = scanner.nextInt();

            hotel[room] = new Renter(name, email);
        }

        System.out.println("Busy Rooms:");

        IntStream.range(0, hotel.length)
                .filter(i -> hotel[i] != null)
                .mapToObj(i -> i + ": " + hotel[i].getName() + ", " + hotel[i].getEmail())
                .forEach(System.out::println);

    }

}
