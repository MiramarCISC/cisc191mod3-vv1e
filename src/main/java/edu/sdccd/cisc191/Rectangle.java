package edu.sdccd.cisc191;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    /**
     * Creates a Rectangle instance
     * @param name Name of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(String name, double width, double height) {
        super(name);

        if (width < 0.0) {
            throw new IllegalArgumentException("A rectangle cannot have a negative width.");
        } else if (height < 0.0) {
            throw new IllegalArgumentException("A rectangle cannot have a negative height.");
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        // w*h
        return this.width * this.height;
    }

    @Override
    public double perimeter() {
        // 2(w+h)
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return this.describe() + String.format(" {width=%.4f, height=%.4f}", this.width, this.height);
    }
}
