package edu.sdccd.cisc191;

abstract public class Shape implements Measurable,Comparable<Shape> {
    private final String name;

    Shape(String name) {
        this.name = name;
    }

    public abstract double perimeter();

    public String getName() {
        return this.name;
    }

    public String describe() {
        return String.format(
            "%s{name='%s', area=%.4f, perimeter=%.4f}",
            this.getClass().getSimpleName(), this.name, this.area(), this.perimeter()
        );
    }

    @Override
    public abstract double area();

    @Override
    public int compareTo(Shape s) {
        int areaCompare = Double.compare(this.area(), s.area());

        if (areaCompare != 0) return areaCompare;

        return this.getName().compareTo(s.getName());
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Shape shape)
            && shape.area() == this.area()
            && shape.perimeter() == this.perimeter();
    }
}
