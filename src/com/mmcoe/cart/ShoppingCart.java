package com.mmcoe.cart;

public class ShoppingCart implements Shopping{
//	private Product[] items;
	private LLProduct<Product> items;
	private double total;
	private int idx;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		items = new LLProduct<Product>();
	}
	
	public void AddToCart(Product p) throws CartException {
//		if(items.length == 5) {
//			System.out.println("Cart is full!");
//		}
//		Product p1 = new Product();
//		p1 = p;
//		
//		for(int i=0;i<5;i++) {
//			if(items[i].name == null && items[i].price == 0)
//				items[i] = p1;
//		}
		if(items.getSize() == 5)
			throw new CartException("Cart is full! checkout");
			
		else {
			items.add(p);
			total += p.getPrice();
		}
	}
	
	public void checkout() throws CartException{
		if(items.getSize() == 0)
			throw new CartException("Cart is Empty!");
		items.print();
		System.out.println("Cart total : "+total);
	}
	
 }
