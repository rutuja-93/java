package _14_string_handling;

public class Demo11startsWith {
    public static void main(String[] args) {
        String s1="aaaabbbbbbcccccddddaaaa";
        s1=s1.replace("a", "A");
        System.out.println(s1);


        // startsWith() & endsWith()
        System.out.println(s1.startsWith("X"));// false
        System.out.println(s1.endsWith("A"));// true


    }
}
