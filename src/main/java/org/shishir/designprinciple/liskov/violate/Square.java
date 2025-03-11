package org.shishir.designprinciple.liskov.violate;

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;  // Violates LSP
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;  // Violates LSP
    }
}

/*
    Why This Violates LSP?

    Square changes the behavior of setWidth() and setHeight()—it ensures both sides
    are always equal, breaking the expectations set by Rectangle.
    If a method expects a Rectangle, replacing it with Square will cause unexpected results.
 */
