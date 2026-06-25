package day2;

@FunctionalInterface
interface Hello {
	String greet();
//	void movie();
	default void demo() {
		System.out.println("Hello Demo "+ temp());
	}
	
	static void test() {
		System.out.println("Hello test");
	}
	
	private String temp() {
		return "hello temp";
	}
	
}

@FunctionalInterface
interface Print {
	void print(String name);
//	void movie();
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		Hello h1 = () ->"Hello Greet";
		System.out.println(h1.greet());
		h1.demo();
		Hello.test();
		
		Hello h2 = () -> {
			String msg =  "Bonjour Lamda";
			return msg;
		};
		System.out.println(h2.greet());
		
		Print p1 = (name) -> System.out.println(name);
		p1.print("Amir");
		
		Print p2 = System.out::println;
		p2.print("Ravi");
	}
}
