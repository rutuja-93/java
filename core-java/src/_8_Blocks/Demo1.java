package _8_Blocks;

public class Demo1 {
        {
            System.out.println("A::instance block");

        }

        static {
            System.out.println("A::static block");
        }

        A() {
            System.out.println("A::constructor");
        }
    }