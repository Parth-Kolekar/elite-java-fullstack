package com.mmcoe.stock;

public class Holder {

    private Stock stock;

    public Holder() {
        stock = Stock.getInstance();
    }

    public void viewQuote() {
        System.out.println("Current Quote: " + stock.getQuote());
    }
}