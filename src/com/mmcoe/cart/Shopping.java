package com.mmcoe.cart;

public interface Shopping  {
	void AddToCart(Product p)  throws CartException;
	void  checkout()throws CartException;
}
