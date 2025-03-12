package org.shishir.designprinciple.openclose.violate;

class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1; // 10% discount
        } else if (customerType.equals("Premium")) {
            return amount * 0.2; // 20% discount
        } else {
            return 0; // No discount
        }
    }
}
/**
 *  Why does this violate OCP?
 *
 * If we need to add a new discount type (e.g., "Gold"), we must modify the class,
 * violating OCP. The class is not closed for modification, making maintenance harder
 */
