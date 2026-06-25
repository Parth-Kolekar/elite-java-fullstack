package com.mmcoe.cart;

public final class CartFactory {
	private CartFactory() {
		// TODO Auto-generated constructor stub
	}
	  
	public static Shopping newCart() {
		return new ShoppingCart();
	}
}
