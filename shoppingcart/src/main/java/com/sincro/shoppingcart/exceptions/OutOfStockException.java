package com.sincro.shoppingcart.exceptions;

public class OutOfStockException extends Exception{

    public OutOfStockException(){

        System.out.println("Item you requested is currently unavailable");
    }


}
