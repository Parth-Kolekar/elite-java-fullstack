package collection_api;

import java.util.HashMap;


public class MapDemo {
		public static void main(String[] args) {
			
			HashMap<String, String> mp =new HashMap<>();	
			
			mp.put("SCOTT", "tiger");
			mp.put("JACK", "jill");
			mp.put("RICHARD", "parker");
			mp.put("JACK", "rose");
			mp.put("PETER", "putin");
			
			System.out.println("Scott : " + mp.get("SCOTT"));
			System.out.println("Richard : " + mp.get("RICHARD"));
			System.out.println("Jack : " + mp.get("JACK"));
			
			System.out.println("------------");
			
//			mp.forEach(System.out::println);
			
			for(String s: mp.keySet())
				System.out.println(s + "->" + mp.get(s));
			
			System.out.println("------------");
			mp.forEach((key,value) -> System.out.println(key +": "+value));
			
		}
}
