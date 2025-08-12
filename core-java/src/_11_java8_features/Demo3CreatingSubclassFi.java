package _11_java8_features;

public class Demo3CreatingSubclassFi {

    // Step 1: Declare the functional interface OUTSIDE main
    @FunctionalInterface
    interface NumberProcessor {
        int process(int number);
    }

    public static void main(String[] args) {

        // ------------------------
        // 1️⃣ Traditional subclass way
        // ------------------------
        class Square implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }

        class Cube implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        }

        NumberProcessor square1 = new Square();
        NumberProcessor cube1 = new Cube();

        System.out.println("Traditional way:");
        System.out.println("Square of 19 is : " + square1.process(19));
        System.out.println("Cube of 19 is : " + cube1.process(19));

        System.out.println("--------------------------------");

        // ------------------------
        // 2️⃣ Anonymous inner class way
        // ------------------------
        NumberProcessor square2 = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };

        NumberProcessor cube2 = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };

        System.out.println("Anonymous inner class way:");
        System.out.println("Square of 19 is : " + square2.process(19));
        System.out.println("Cube of 19 is : " + cube2.process(19));

        System.out.println("--------------------------------");

        // ------------------------
        // 3️⃣ Lambda expression way (Java 8+)
        // ------------------------
        NumberProcessor square3 = n -> n * n;
        NumberProcessor cube3 = n -> n * n * n;

        System.out.println("Lambda expression way:");
        System.out.println("Square of 19 is : " + square3.process(19));
        System.out.println("Cube of 19 is : " + cube3.process(19));
    }
}
