package edu.sdccd.cisc191;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String name, double width, double height) {
        super(name);

        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return this.describe() + String.format(" {width=%.4f, height=%.4f}", this.width, this.height);
    }
}
