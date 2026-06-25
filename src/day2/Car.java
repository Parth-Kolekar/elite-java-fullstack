package day2;

public class Car {
	private  String model;
	private String[] features;
	
	
	public Car(String model, String... features) {
//		super();
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for(String f:features) {
			System.out.println(f);
		}
	}
	
	public static void main(String[] args) {
//		String[] s = {"clutch","break","gear"};
		Car c = new Car("Thar","clutch","break","gear");
		
//		System.out.println(c.specs);
		c.specs();
	}
	
}
