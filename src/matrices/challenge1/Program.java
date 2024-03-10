package matrices.challenge1;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix();
        int row;
        int column;
        int value;
        int choice;

        do {
            System.out.println("Type 1 to create a new matrix");
            System.out.println("Type 2 to print the matrix");
            System.out.println("Type 3 to observe a position in the matrix");
            System.out.println("Type 4 to change a value in the matrix");
            System.out.println("Type 5 to delete the matrix");
            System.out.println("Type 6 to exit the program");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Insert number of rows");
                    int rows = scanner.nextInt();
                    System.out.println("Insert number of columns");
                    int columns = scanner.nextInt();

                    matrix = new Matrix(rows, columns);

                    for (row = 0; row < rows; ++row) {
                        for (column = 0; column < columns; column++) {
                            System.out.println("Insert value for position (" + (row + 1) + ", " + ( column+ 1) + "):");
                            value = scanner.nextInt();
                            matrix.setValueAtPosition(row, column, value);
                        }
                    }
                    break;

                case 2:
                    matrix.printMatrix();
                    break;

                case 3:
                    // observe neighbours at position
                    System.out.println("Insert desired position:");
                    System.out.println("Row:");
                    row = scanner.nextInt() - 1;
                    System.out.println("Column:");
                    column = scanner.nextInt() - 1;

                    matrix.observeNeighboursAtPosition(row, column);
                    break;

                case 4:
                    // change value at position
                    System.out.println("Insert desired position:");
                    System.out.println("Row:");
                    row = scanner.nextInt() - 1;
                    System.out.println("Column:");
                    column = scanner.nextInt() - 1;
                    System.out.println("Current value is: " + matrix.getValueAtPosition(row, column));

                    System.out.println("Insert new value");
                    value = scanner.nextInt();
                    matrix.setValueAtPosition(row, column, value);
                    break;

                case 5:
                    matrix.deleteMatrix();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
