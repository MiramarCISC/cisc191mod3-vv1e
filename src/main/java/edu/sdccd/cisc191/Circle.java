package edu.sdccd.cisc191;

public class Circle extends Shape {
    private final double radius;

    /**
     * Creates a Circle instance.
     * @param name Name of the Circle
     * @param radius Radius of the Circle
     */
    public Circle(String name, double radius) {
        super(name);

        if (radius < 0.0) {
            throw new IllegalArgumentException("A Circle cannot have a negative radius.");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        // πr^2
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        // 2πr
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return this.describe() + String.format(" {radius=%.4f}", this.radius);
    }
}
