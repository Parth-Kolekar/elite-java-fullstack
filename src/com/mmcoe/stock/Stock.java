package com.mmcoe.stock;

public class Stock {
    private static Stock instance = new Stock();

    private double quote;

    private Stock() {
    }

    public static Stock getInstance() {
        return instance;
    }

    public double getQuote() {
        return quote;
    }

    public void setQuote(double quote) {
        this.quote = quote;
    }
}