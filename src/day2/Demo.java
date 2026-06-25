package day2;

public class Demo <T>{
	private T data;
	public Demo(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo <String>d1 = new Demo<String>("Hola");
//		d1.setData(100);s
		System.out.println(d1.getData());
		
		Demo <Double>d2 = new Demo<Double>(3.14);
		System.out.println(d2.getData());
		
		Demo <Object> d3 = new Demo<Object>(new Person("Kim",22));
		System.out.println(d3.getData());
	}
	
}
