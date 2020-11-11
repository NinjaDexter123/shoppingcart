package com.sincro.shoppingcart.service;

import com.sincro.shoppingcart.discount.CustomerEnum;
import com.sincro.shoppingcart.model.DiscountCalculator;

public class ShoppingCart {

private CustomerEnum customerType;

private DiscountCalculator discount;

private double shoppingAmount;

    private double billingAmount;


public double calculateBillingAmount(CustomerEnum customerType, Double shoppingAmount, double discount){

    billingAmount = shoppingAmount - shoppingAmount* discount;

    return billingAmount;


}

}
