package _14_string_handling;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = new String("abc");// heap or scp
        String str2 = new String("abc");//only heap
        String str3= "abc";// no any where
        String str4= "xyz";// scp
    }
}
