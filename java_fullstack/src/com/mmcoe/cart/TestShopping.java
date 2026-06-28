package com.mmcoe.cart;

public class TestShopping {
	
	public static void main(String[] args) {
		Product p1 = new Product("Carrot",34);
		Product p2 = new Product("apple",10);
		Product p3 = new Product("banana",24);
		Product p4 = new Product("mango",38);
		Product p5 = new Product("guava",49);
//		
//		ShoppingCart s = new ShoppingCart();
		
//		CartFactory factory = new CartFactory();
		Shopping s = CartFactory.newCart();		
		
		
		try {
		s.AddToCart(p5);
		s.AddToCart(p2);
		s.AddToCart(p1);
//		s.AddToCart(p3);
//		s.AddToCart(p4);
		s.AddToCart(p5);
		s.AddToCart(new Product("watermelon",100));
		}
		catch(CartException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			s.checkout();
		}
		catch(CartException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		
	}
}
