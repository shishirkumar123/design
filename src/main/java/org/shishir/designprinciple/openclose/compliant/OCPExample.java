package org.shishir.designprinciple.openclose.compliant;

public class OCPExample {
    public static void main(String[] args) {
        DiscountCalculator regularDiscount = new DiscountCalculator(new RegularCustomerDiscount());
        System.out.println("Regular Customer Discount: " + regularDiscount.calculateDiscount(1000)); // 100

        DiscountCalculator premiumDiscount = new DiscountCalculator(new PremiumCustomerDiscount());
        System.out.println("Premium Customer Discount: " + premiumDiscount.calculateDiscount(1000)); // 200

        DiscountCalculator goldDiscount = new DiscountCalculator(new GoldCustomerDiscount());
        System.out.println("Gold Customer Discount: " + goldDiscount.calculateDiscount(1000)); // 300
    }
}

/*

    Why This Follows OCP?
     Open for Extension – We can add new discount types without modifying existing code.
     Closed for Modification – The DiscountCalculator class remains unchanged
                                when adding new strategies.
     Uses Polymorphism – Different discount types follow the same interface, ensuring
                          scalability.
 */

