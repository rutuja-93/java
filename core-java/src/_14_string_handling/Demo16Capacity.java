package _14_string_handling;

public class Demo16Capacity {
    public static void main(String[] args) {
        //capacity--->max elements that can be added
        //length--->actual element
        //default capacity is 16

        StringBuilder sb=new StringBuilder("Hello ");
        System.out.println("length "+ sb.length());
        System.out.println("capacity "+sb.capacity());


        StringBuilder sb1=new StringBuilder(50);
        System.out.println("length "+ sb1.length());
        System.out.println("capacity "+sb1.capacity());
    }
}
