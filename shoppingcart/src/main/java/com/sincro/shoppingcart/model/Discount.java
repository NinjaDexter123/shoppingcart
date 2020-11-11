package com.sincro.shoppingcart.model;

import com.sincro.shoppingcart.discount.CustomerEnum;
import com.sun.istack.NotNull;

public class DiscountCalculator {

    private Enum customerType;

    private double shoppingAmount;

    private double totalAmount;

    private double discount;

    public double calculateDiscount(
            Enum customerType, double shoppingAmount, double discount
    ) {
        if (customerType == CustomerEnum.PREMIUM) {
            if (shoppingAmount < 4000) {
                discount = shoppingAmount * 0.1;

            } else if (shoppingAmount < 8000) {
                discount = shoppingAmount * 0.15;

            } else if (shoppingAmount < 12000) {
                discount = shoppingAmount * 0.2;

            } else if (shoppingAmount > 12000) {
                discount = shoppingAmount * 0.3;

            }

        } else {

            if (shoppingAmount <= 5000) {
                discount = shoppingAmount * 0;

            } else if (shoppingAmount < 10000) {
                discount = shoppingAmount * 0.10;


            } else if (shoppingAmount >= 10000) {
                discount = shoppingAmount * 0.20;

            }

        }
        return discount;

    }


}
