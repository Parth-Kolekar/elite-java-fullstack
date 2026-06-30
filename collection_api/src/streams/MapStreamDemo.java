package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {
		public static void main(String[] args) {
			Map<String,String> people =  new HashMap<>();
			people.put("Polo","Pune");
			people.put("Mili","Mumbai");
			people.put("Deny","Delhi");
			
			people.values().stream().forEach(System.out::println);
			
			List<String> cities = people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
			
			cities.forEach(System.out::println);
			
			Map<String, List<String>> contacts = new HashMap<>();
			contacts.put("Fredo", Arrays.asList("1212-3434","5656-7878"));
			contacts.put("Sean", Arrays.asList("2212-3452","5665-9696","4343-1919"));
			contacts.put("Ben", Arrays.asList("2112-3434","7878-5858","8090-3431"));
			
//			contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
			
			contacts.values().stream().flatMap(Collection::stream).filter(s->s.contains("8")).forEach(System.out::println);
			
			contacts.values().stream().flatMap(Collection::stream).map(s->s.replace("-", " ")).forEach(System.out::println);
		}
}
