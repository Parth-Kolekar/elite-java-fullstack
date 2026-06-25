package day2;

interface Greeting{
	void sayHello();
}

public class GreetingDemo {

	class GreetingInnerImpl implements Greeting{

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Greeting inner hello");
			}	
		}
	
	public void AnotherDemo() {
		class GreetingNestedImpl implements Greeting{

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Greeting Nested impl");
			}
				
		};
		new GreetingNestedImpl().sayHello();
	}
		
		public static void main(String[] args) {
			GreetingDemo g = new GreetingDemo();
			Greeting g1 = g.new GreetingInnerImpl();
			g1 .sayHello();
			
			g.AnotherDemo();
			
			Greeting g3 = new Greeting () {
				
				
				@Override
				public void sayHello() {
					// TODO Auto-generated method stub
					System.out.println("Anonymous Greeting");
					
				}
			};
			g3.sayHello();
			
			Greeting greet  = () -> System.out.println("Greetings from Lamba");
			greet.sayHello();
		}
		
}
