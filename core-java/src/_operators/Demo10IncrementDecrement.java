package _operators;

public class Demo10IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("Pre-increment");
        int a = 10;
        int b = ++a;//11
        System.out.println("a = " + a);//11
        System.out.println("b = " + b);//11

        System.out.println("Post-increment");
        int c = 10;
        int d = c++;
        System.out.println("c = " + c);//11
        System.out.println("d = " + d);//10



        System.out.println("Pre-decrement");
        int a1 = 10;
        int b1 = --a1;
        System.out.println("a = " + a1);//9
        System.out.println("b = " + b1);//9

        System.out.println("Post-decrement");
        int c1 = 10;
        int d1 = c1--;
        System.out.println("c = " + c1);//9
        System.out.println("d = " + d1);//10



        int w = 1;
        int x = 2;
        int y = 3;
        int z = 4;
        System.out.println(++w + x++ + --y + w++ - ++z + --x); //5
        //a=3 ; b=2  ;   c=2    d=5
        //2+2+2+2-5+2=5

        System.out.println("w = " + w);//3
        System.out.println("x = " + x);//2
        System.out.println("y = " + y);//2
        System.out.println("z = " + z);//5
    }
}
