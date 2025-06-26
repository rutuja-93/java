package _8_blocks;

public class outer1 {
    public static void main(String[] args) {
        System.out.println("outer static variable::" +outer.var);
        outer.A obj=new outer.A();
        obj.m1();
        System.out.println("x = " + obj.x);
        System.out.println("y = " + outer.A.y);
        outer.A.m2();

    }
}
