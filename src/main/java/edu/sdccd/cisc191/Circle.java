package edu.sdccd.cisc191;

public class Circle extends Shape {
    private final double radius;

    public Circle(String name, double radius) {
        super(name);

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return this.describe() + String.format(" {radius=%.4f}", this.radius);
    }
}
