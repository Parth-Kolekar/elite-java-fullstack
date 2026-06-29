package collection_api;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
	
	public static void main(String[] args) {
//		ResourceBundle bundle =  ResourceBundle.getBundle("msgs");
//		ResourceBundle bundle =  ResourceBundle.getBundle("msgs", Locale.FRANCE);
		ResourceBundle bundle =  ResourceBundle.getBundle("msgs", Locale.of("jp"));
		
		
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}
}
