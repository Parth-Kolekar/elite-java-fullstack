package com.mmcoe.ds;

public class BinaryTree  {
	private class Node {
		private int data;
		public Node left,right;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			left = null;
			right = null;
		}
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	
	public void add(int data) {
		Node n =new Node(data);
		
		if(root == null) {
			root=n;
			return;
		}
		
		Node t = root;
		while(true) {
			if(data == t.data) break;
			if(t.data > data) {
				if(t.left == null) {
					t.left = n;
					break;
				}
				t = t.left;
			}
			else {
				if(t.right== null) {
					t.right = n;
					break;
				}
				t = t.right;
			}	
		}
	}
	
	public void preorder() {
		preorder(root);
		System.out.println("------PREORDER");
	}
	public void preorder(Node root) {
		if (root == null) {
	        return;
	    }
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
		
	}
	public void inorder() {
		inorder(root);
		System.out.println("------ INORDER");
	}
	public void inorder(Node root) {
		if (root == null) {
	        return;
	    }
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}

	
}
