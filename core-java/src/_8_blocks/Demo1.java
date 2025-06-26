package _8_blocks;

public class Demo1 {
    public static void main(String[] args) {
        class A{
            {
                System.out.println("A::Instance Block");// second executed
            }
            static {
                System.out.println("A::Static Block");//  executed firstly
            }
            A(){
                System.out.println("A::Constructor");// third executed
            }
        }
        A a1 =new A();
        A a2=new A();
        A a3=new A();
        A a4=new A();

    }
}