import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
		public static void main(String[] args) {
			LocalDate d1 = LocalDate.now();
			System.out.println(d1);
			
			LocalDate d2 = LocalDate.of(2012,4,2);
			System.out.println(d2);
			
			LocalDate d3 = LocalDate.parse("2019-03-29");
			System.out.println(d3);
			
			LocalDate d4 = LocalDate.of(2005,4,9);
			System.out.println(d4);
			
			System.out.println(d1.plusDays(1));
			System.out.println(d1.minus(1,ChronoUnit.MONTHS));
			System.out.println(d2.getDayOfWeek());
			System.out.println(d3.getDayOfMonth());
			System.out.println(d2.isLeapYear());
			
			System.out.println(d4.until(d1));
			System.out.println(d4.getYear());
			
		}
}
