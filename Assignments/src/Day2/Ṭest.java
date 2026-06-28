package Day2;


public class Ṭest {

		public static void main(String[] args) {
			Book b1 = new Book("Alchemist");
			Book b2 = new Book("Twilight");

			Member m1 = new Member("George");
			Member m2 = new Member("Sam");

			b1.status();
			m1.status();
			// issue logic

			b1.issue(m1);
			b2.issue(m2);

			b1.status();
			m1.status();

			b1.revoke(m1);
			b2.revoke(m2);

			b1.status();
			m1.status();
		}
}
