package _6_class_object;

public class _variables {
    int a=20;
    int b=30;
    static int c=80;

    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;

        System.out.println("******Local variable**********");
        System.out.println("a is " +a);
        System.out.println("b is " +b);
        System.out.println("c is " +c);


        System.out.println("***********Instance variable************");
        _variables ref=new _variables();
        System.out.println("a is " +ref.a);
        System.out.println("b is " +ref.b);


        System.out.println("******static variable*******");
        System.out.println("c is " +_variables.c);

    }
}
