package edu.sdccd.cisc191;

public class Triangle extends Shape {
    private final double s1;
    private final double s2;
    private final double s3;

    public Triangle(String name, double s1, double s2, double s3) {
        super(name);

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double area() {
        double ph = this.perimeter() / 2;

        // A = √(p(p-a)(p-b)(p-c))
        return Math.sqrt(ph * (ph - s1) * (ph - s2) * (ph - s3));
    }

    @Override
    public double perimeter() {
        return this.s1 + this.s2 + this.s3;
    }

    @Override
    public String toString() {
        return this.describe() + String.format(" {s1=%.4f, s2=%.4f, s3=%.4f}", this.s1, this.s2, this.s3);
    }
}
