
package edu.sdccd.cisc191;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // List<Shape>
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("A",2));
        shapes.add(new Rectangle("B",3,4));
        shapes.add(new Triangle("C",3,4,5));

        // Polymorphic Loop
        System.out.println("--- Original shapes: ---");
        for (Shape s : shapes) {
            System.out.println(s.describe());
        }

        // Shape.equals()
        Circle c1 = new Circle("Cirky", 3.14);
        Circle c2 = new Circle("Cirky", 3.14);

        Circle c3 = new Circle("Evil Cirky", 4.13);

        System.out.printf(
            """
            \n--- Comparing equal shapes: ---
            c1 : %s
            c2 : %s
            c1 == c2? %b
            c1.equals(c2)? %b
            ---
            c1 : %s,
            c3: %s,
            c1 == c3? %b
            c1.equals(c3)? %b
            """,
            c1, c2, c1 == c2, c1.equals(c2),
            c1, c3, c1 == c3, c1.equals(c3)
        );

        // Area Sorting (Natural)
        Collections.sort(shapes);
        System.out.println("\n--- Sorted by Area (Natural): ---");
        shapes.forEach(System.out::println);

        // Area Sorting (custom)
        shapes.sort(Comparator.comparingDouble(Shape::area));
        System.out.println("\n--- Sorted by Area (Custom): ---");
        shapes.forEach(System.out::println);
    }
}
