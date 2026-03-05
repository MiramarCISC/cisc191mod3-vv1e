package edu.sdccd.cisc191;

abstract public class Shape implements Measurable,Comparable<Shape> {
    private final String name;

    /**
     * Creates a Shape instance
     * @param name Name of the Shape
     */
    Shape(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A Shape cannot have a null or blank name");
        }
        this.name = name;
    }

    /**
     * Returns the Shape's Perimeter
     */
    public abstract double perimeter();

    public String getName() {
        return this.name;
    }

    /**
     * Describes the Shape using its Class name, Area, and Perimeter.
     */
    public String describe() {
        return String.format(
            "%s{name='%s', area=%.4f, perimeter=%.4f}",
            this.getClass().getSimpleName(), this.name, this.area(), this.perimeter()
        );
    }

    /**
     * Returns the Shape's area
     */
    @Override
    public abstract double area();

    /**
     * Compares Shape by area and by name in alphabetical order.
     * @param s the object to be compared.
     */
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
