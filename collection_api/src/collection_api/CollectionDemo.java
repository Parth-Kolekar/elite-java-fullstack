package collection_api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
		public static void main(String[] args) {
			LinkedList<String> lst = new LinkedList<String>();
			lst.add("Apple");
			lst.add("Microsoft");
			lst.add("Google");
			lst.add("Apache");
			lst.add("Oracle");
			lst.add("Meta");
			
			System.out.println("--- Traversing using a Iterator ----");
			Iterator<String> itr = lst.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println("--- Traversing using a loop ----");
			for(int i=0;i<lst.size();i++) {
				System.out.println(lst.get(i));
			}
			
			System.out.println("--- Traversing using a For-each ----");
			for(String e : lst) {
				System.out.println(e);
			}
			
			System.out.println("--- Traversing using a For-each method----");
			lst.forEach(System.out::println);
			
			
			
			ArrayList<String> arr = new ArrayList<String>();
			
			arr.add("IBM");
			arr.add("Apple");
			arr.add("Nvidea");
			lst.add("Google");
			lst.add("Apache");
			
			arr.addAll(lst);  //merging 2 collections
			System.out.println("--- Traversing over a merged Collection");
			for(String e :arr) {
				System.out.println(e);
			}
			
			
			HashSet<String> set = new HashSet<String>(arr);
			System.out.println("------ Traversing over a Set Collection");
			for(String e :set) {
				System.out.println(e);
			}
			
			TreeSet<String> tree = new TreeSet<String>(set);
			System.out.println("----- Traversing over a sorted Set Collection");
			for(String e :tree) {
				System.out.println(e);
			}
		}
}
