package org.shishir.designprinciple.liskov.compliant;

public class LSPExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape square = new Square(10);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }
}

/*
    * Liskov Substitution Principle (LSP) states that objects of a superclass shall be
    * replaceable with objects of its subclasses without affecting the functionality of
    * the program.
    * Now, we can substitute Rectangle or Square in any code that expects Shape
    * without breaking the logic!
 */
