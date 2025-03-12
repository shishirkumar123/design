package org.shishir.designprinciple.openclose.compliant;

class RegularCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.1; // 10% discount
    }
}

class PremiumCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.2; // 20% discount
    }
}

// New Discount Type - No need to modify existing classes!
class GoldCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.3; // 30% discount
    }
}

