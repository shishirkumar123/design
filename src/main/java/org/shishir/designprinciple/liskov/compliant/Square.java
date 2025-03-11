package org.shishir.designprinciple.liskov.compliant;

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}

/*
    Why This Complies with LSP?

    Square implements the Shape interface, which has a getArea() method.
    Square does not change the behavior of getArea()—it calculates the area of a square.
    If a method expects a Shape, replacing it with Square will not cause unexpected results.
 */