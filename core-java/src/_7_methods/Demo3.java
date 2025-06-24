package _7_methods;

public class Demo3 {
    public static void main(String[] args) {
        class A{

            public void m1(){
                System.out.println("A m1");
            }
            public void m2(){
                System.out.println("A m2");
            }
            public void m3(){
                System.out.println("A m3");
            }
        }
        class B{
            A a=new A();
            public void m1(){
                System.out.println("B m1");

                a.m1();
            }

            public void m2(){
                System.out.println("B m2");

                a.m2();
            }

            public void m3(){
                System.out.println("B m3");
a.m3();
            }
        }
        class C{
            B b=new B();
            public void m1(){
              b.m1();
            }
            public void m2(){
             b.m2();
            }
            public void m3(){
             b.m3();
            }
        }
        C c=new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
