package com.mmcoe.cart;

public class LLProduct <I>{

		private class Node {
			private I data;
//			private String name;
			private Node next;
			
			public Node(I data){
			    this.data = data;
			    next = null;
			}
			public I getData() {
				return data;
			}
		}
		
		private Node head,last;
		private int size=0;
		
		public void add(I data) {
			Node n = new Node(data);
			if(head == null) {
				head = n;
				last =n;
			}
			else {
				last.next = n;
				last = n;
				size++;
			}
		}
		
		public void print() {
			Node temp = head;
			
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			
		}
		
		public void insert(int idx, I data) {
			Node temp = head;
			if(idx > size) {
				throw new IllegalArgumentException();
			}
			Node n = new Node(data);
			if(idx == 0) {	
				n.next =head.next;
				head = n;
				size++;
				return;
			}else if(idx == size){
				last.next = n;
				last = n;
				size++;
				return;
			}
			else{	
				for(int i=0;i<idx;i++) {
					temp = temp.next;
				}
			}
			
			n.next = temp.next;
			temp.next = n;
			size++;
			
		}
		
		public void remove(int idx) {
			Node temp = head;
			  if (size == 0 || idx < 0 || idx >= size) {
			        throw new IllegalArgumentException("Index not available");
			    }
			  if(idx ==0) {
				  head = head.next;
			  }
			  else {
			for(int i=0;i<idx-1;i++) {
				temp = temp.next;
			}
			Node n = temp.next;
			temp.next = n.next;
			if(n ==last)
				last = temp;
			size--;
		}
		}

		public int getSize() {
			return size;
		}
		
		
	

}
