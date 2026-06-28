package com.mmcoe.ds;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		BinaryTree b= new BinaryTree();
		
		b.add(1);
		b.add(15);
		b.add(17);
		b.add(20);
		b.add(18);
		b.add(8);
		
		b.preorder();
		b.inorder();
		
		b.add(5);
		b.add(32);
		
		b.preorder();
		b.inorder();
	}
}
