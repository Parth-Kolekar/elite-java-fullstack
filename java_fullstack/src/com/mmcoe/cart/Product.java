package com.mmcoe.cart;

public class Product {
		private String name;
		private double price;
		
		public Product() {
			// TODO Auto-generated constructor stub
			this(null,0);
		}
		
		public Product(String name,double price) {
			this.name = name;
			this.price = price;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Product [Name=" +name+", price = "+price+ "]";
		}
		
		public double getPrice() {
			return price;
		}
		
		
}
