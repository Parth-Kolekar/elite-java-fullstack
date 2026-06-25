package com.mmcoe.stock;

public class Broker {

    private Stock stock;

    public Broker() {
        stock = Stock.getInstance();
    }

    public void viewQuote() {
        System.out.println("Current Quote: " + stock.getQuote());
    }
}