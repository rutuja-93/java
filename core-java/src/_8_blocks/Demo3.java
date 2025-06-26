package _8_blocks;

public class Demo3 {
    class inner{
        int x=100;
        void m1(){
            System.out.println("inner class:: m1 instance method ");
        }
    }

    public static void main(String[] args) {
        Demo3 outerObj=new Demo3();
        inner innerObj=outerObj.new inner();
        System.out.println("inner class instance variable x::" +innerObj.x);
        innerObj.m1();
    }
}
