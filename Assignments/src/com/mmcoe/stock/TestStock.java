package com.mmcoe.stock;

public class TestStock {

    public static void main(String[] args) {

        Exchange exchange = new Exchange();
        Broker broker = new Broker();
        Holder holder = new Holder();

        exchange.setQuote(1250.75);

        broker.viewQuote();
        holder.viewQuote();

        exchange.setQuote(1285.40);

        broker.viewQuote();
        holder.viewQuote();
    }
}