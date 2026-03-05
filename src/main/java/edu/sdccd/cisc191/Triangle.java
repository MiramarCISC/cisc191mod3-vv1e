package edu.sdccd.cisc191;

public class Triangle extends Shape {
    private final double s1;
    private final double s2;
    private final double s3;

    /**
     * Creates a Triangle instance
     * @param name Name of the Triangle
     * @param s1 First side of the Triangle
     * @param s2 Second side of the Triangle
     * @param s3 Third side of the Triangle
     */
    public Triangle(String name, double s1, double s2, double s3) {
        super(name);

        if (s1 < 0.0) {
            throw new IllegalArgumentException("A triangle cannot have a negative side 1.");
        } else if (s2 < 0.0) {
            throw new IllegalArgumentException("A rectangle cannot have a negative side 2.");
        } else if (s3 < 0.0) {
            throw new IllegalArgumentException("A rectangle cannot have a negative side 3.");
        }

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double area() {
        double ph = this.perimeter() / 2;

        // √(p(p-a)(p-b)(p-c))
        return Math.sqrt(ph * (ph - s1) * (ph - s2) * (ph - s3));
    }

    @Override
    public double perimeter() {
        // a+b+c
        return this.s1 + this.s2 + this.s3;
    }

    @Override
    public String toString() {
        return this.describe() + String.format(" {s1=%.4f, s2=%.4f, s3=%.4f}", this.s1, this.s2, this.s3);
    }
}
