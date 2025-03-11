package org.shishir.designprinciple.liskov.violate;

public class LSPViolationTest {
    public static void main(String[] args) {
        Rectangle rect = new Square(); // Violates LSP
        rect.setWidth(5);
        rect.setHeight(10);  // Expected: width=5, height=10, but Square forces width=10 too!

        System.out.println("Area: " + rect.getArea()); // Incorrect calculation
    }
}
// The program behaves incorrectly because Square overrides the behavior of Rectangle unexpectedly.
