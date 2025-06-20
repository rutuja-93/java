package _6_methods;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("addition is " +add(10 , 20));
        System.out.println("substraction is " +sub(100 , 20));
        System.out.println("multiplication is " +mult(50 , 2));
        System.out.println("division is " +div(100 , 2));
    }

    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mult(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
}
