package _4_accept_user_input;


import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {

        //accept user input[number, char, boolean, String]
        //Scanner class ---> java.util
        //methods ---> nextXXX

       Scanner sc=new Scanner(System.in);
        System.out.println("enter byte value ");
        byte byteValue= sc.nextByte();
        System.out.println("you entered" +byteValue);
    }
}
