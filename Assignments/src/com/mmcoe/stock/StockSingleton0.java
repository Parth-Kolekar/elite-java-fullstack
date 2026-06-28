package com.mmcoe.stock;

public final class StockSingleton0 {

	private StockSingleton0() {
		
	}	
	private static Stock stk;
	
    public  static Stock getStock() {
    		if(stk == null)
    			stk = new Stock();
        
    		return stk;
    }
}