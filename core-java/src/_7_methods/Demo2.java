package _7_methods;

public class Demo2 {
    public static void main(String[] args) {
   // call m1
    m1();

    }

    public  static void m1(){
        //call m2
     m2();
     Demo2.m2();


    }

    public static void m2(){
// call m3 , m4
        Demo2 ref =new Demo2();
        ref.m3();
        ref.m4();
    }

    public void m3(){
 m4();
 this.m4();
    }
    public void m4(){
        Demo2.m1();
        Demo2.m2();
    }
}
