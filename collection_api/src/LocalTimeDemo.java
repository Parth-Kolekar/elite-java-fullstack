
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
		public static void main(String[] args) {
			LocalTime  t1= LocalTime.now();
			System.out.println(t1);
			
			LocalTime d2 = LocalTime.of(06,26);
			System.out.println(d2);
			
			LocalTime d3 = LocalTime.parse("09:34");
			System.out.println(d3);
			
			System.out.println(d2.plus(1,ChronoUnit.HOURS));
			System.out.println(d3.getHour());
			System.out.println(LocalTime.MAX);
			
		}
}

