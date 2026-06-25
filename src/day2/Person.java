package day2;

public class Person implements Cloneable {

	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
		this("johnny",-1);
	}

	public Person(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name:" + name +" "+"age:" +age);
	}
	
	public static void main(String[] args){
		Person p1 = new Person("Polo",22);
		p1.print();
		Person p2 = new Person("Polo",22);
		p2.print();
		
//		System.out.println(p1.hashCode());
//		System.out.println(p2);
		System.out.println(p1.equals(p2));
		
//		Person pc = (Person) p1.clone();
//		System.out.println(pc);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.age == p.age && this.name.equals(p.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
