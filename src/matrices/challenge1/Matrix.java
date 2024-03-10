package matrices.challenge1;

public class Matrix {
    public Integer[][] matrix;

    public Matrix() {

    }

    public Matrix (int rows, int columns) {
        this.matrix = new Integer[rows][columns];
    }

    public int getValueAtPosition(int row, int column) {
        return matrix[row][column];
    }

    public void setValueAtPosition(int row, int column, int value) {
        matrix[row][column] = value;
    }

    public void printMatrix() {
        for (Integer[] row : matrix) {
            System.out.print("| ");
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public void observeNeighboursAtPosition(int row, int column) {
        System.out.println("Value at position " + row + ", " + column + " is: " + matrix[row][column]);
        int numOfRows = matrix.length;
        int numOfCols = matrix[0].length;

        if (column > 0) {
            System.out.println("Left: " + matrix[row][column - 1] + ", at position " + "(" + row + ", " + (column - 1) + ")");
        } else {
            System.out.println("Left: boundary reached!");
        }

        if (row > 0) {
            System.out.println("Up: " + matrix[row - 1][column] + ", at position " + "(" + (row - 1) + ", " + column + ")");
        } else {
            System.out.println("Up: boundary reached!");
        }

        if (column < numOfCols - 1) {
            System.out.println("Right: " + matrix[row][column + 1] + ", at position " + "(" + row + ", " + (column + 1) + ")");
        } else {
            System.out.println("Right: boundary reached!");
        }

        if (row < numOfRows - 1) {
            System.out.println("Down: " + matrix[row + 1][column] + ", at position " + "(" + (row + 1) + ", " + column + ")");
        } else {
            System.out.println("Down: boundary reached!");
        }
    }

    public void deleteMatrix() {

    }
}
