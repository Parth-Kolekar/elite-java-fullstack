//package com.mmcoe.stock;
//
//public class Exchange extends Broker {
//
//}
package com.mmcoe.stock;

public class Exchange {

    private Stock stock;

    public Exchange() {
        stock = Stock.getInstance();
    }

    public void setQuote(double quote) {
        stock.setQuote(quote);
        System.out.println("Quote Updated: " + quote);
    }
}