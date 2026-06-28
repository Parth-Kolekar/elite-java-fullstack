package Day1;

public class TestMain {

    public static void main(String[] args) {

        System.out.println("----- Upcasting -----");

        // Upcasting: Child object referenced by Parent reference
        Alfa obj1 = new Beta();

        obj1.demo(); // Calls Beta's overridden method (Runtime Polymorphism)

        // obj1.betaOnlyMethod(); // Compilation Error

        System.out.println("\n----- Downcasting -----");

        // Downcasting: Parent reference converted back to Child reference
        Beta obj2 = (Beta) obj1;

        obj2.demo();
        obj2.betaOnlyMethod();

        System.out.println("\n----- Another Example -----");

        Alfa obj3 = new Alfa();

        // Unsafe Downcasting
        try {
            Beta obj4 = (Beta) obj3; // Runtime Exception
            obj4.betaOnlyMethod();
        } catch (ClassCastException e) {
            System.out.println("Cannot cast Alfa object to Beta");
        }

        System.out.println("\n----- Safe Downcasting using instanceof -----");

        if (obj1 instanceof Beta) {
            Beta obj5 = (Beta) obj1;
            obj5.betaOnlyMethod();
        }
    }
}