package com.mmcoe.ds;

public class TestLL {
		public static void main(String[] args) {
			LinkedList<Integer> l = new LinkedList<Integer> ();
			
			l.add(12);
			l.add(34);
			l.add(111);
			l.add(10);
			l.add(20);
			l.print();
			System.out.println("------");
			l.insert(4, 45);
//			l.insert(0, 69);
			l.print();
			
			System.out.println("------");
			l.remove(5);
			l.print();
		}
}
