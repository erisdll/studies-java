package oopintro.exercise1;

public class Rectangle {
    public double length;
    public double width;

    public double calcArea() {
        double area = length * width;
        return (int)(area * 100) / 100.00;
    }

    public double calcPerimeter() {
        double perimeter = (length * 2) + (width * 2);
        return (int)(perimeter * 100) / 100.00;
    }

    public double calculateDiagonal() {
        double diagonal =  Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return (int)(diagonal * 100) / 100.00;
    }
}
