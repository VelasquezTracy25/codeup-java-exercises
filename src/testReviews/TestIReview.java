package testReviews;

public class TestIReview {
//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getPower(4, 2));
//
//        System.out.println(getPower(4, 4));
//    }
//
//    class Person {
//        public String firstName;
//        public String lastName;
//
//        public String sayHello() {
//            return String.format("Hello from %s %s!", firstName, lastName);
//        }
//
//        public static void main(String[] args) {
//
//            TestIReview rick = new TestIReview();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());
//            // prints "Hello from Rick Sanchez!"
//        }
//    }
     public static long worldPopulation = 7_500_000_000L; // class property
        public String name; // instance property

        public static void main(String[] args) {
            TestIReview theBestDrummerAlive = new TestIReview();
            theBestDrummerAlive.name = "Neil Peart";

            TestIReview.worldPopulation += 1; // accessing a static property

            System.out.println(TestIReview.worldPopulation); // 7500000001

            // technically this will work, but it is usually better to reference
            // static properties through the class, not instances
            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001

//            // DONT DO THIS, it will not compile
//            System.out.println(TestIReview.name);
        }
}
