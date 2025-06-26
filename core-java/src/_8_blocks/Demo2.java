package _8_blocks;

public class Demo2 {
    public static void main(String[] args) {
        class A{
            {
                System.out.println("Instance block::A");
            }

            static {
                System.out.println("Static block::A");
            }
            A(){
                super();
                System.out.println("Constructor::A");
            }
        }
        A a1=new A();
        A a2=new A();
        A a3=new A();
        A a4=new A();

    }
}
