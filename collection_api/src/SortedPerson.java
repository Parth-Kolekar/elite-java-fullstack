import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

		public static void main(String[] args) {
			
//				Comparator<Person> ageComp = (p1,p2)-> p1.getAge() - p2.getAge();
//				Comparator<Person> nameComp = (p1,p2) -> p1.getName().compareTo(p2.getName());
 				TreeSet<Person> person = new TreeSet<Person>();
				
				person.add(new Person("Parth",21));
				person.add(new Person("Mona",23));
				person.add(new Person("John",17));
				
				person.forEach(System.out::println);
		}
}
