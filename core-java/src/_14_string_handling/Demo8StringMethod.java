package _14_string_handling;

public class Demo8StringMethod {
    public static void main(String[] args) {
        String str = "IT Shaala";
        System.out.println("string length:" +str.length());


        String str2= "               IT Shaala         ";
        //remove the leading and trailing spaces------->trim()
        str2=str2.trim();
        System.out.println(str2);//IT Shaala
        System.out.println("string length after strim:" +str2.length());
    }
}
