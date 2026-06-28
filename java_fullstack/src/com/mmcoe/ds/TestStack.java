package com.mmcoe.ds;

public class TestStack {
	public static void main(String[] args) {
		Stack s=new Stack(5);
		s.push(10);
		s.push(28);
		s.push(50);
		s.display();
		System.out.println(s.pop());
		s.display();
	}
}