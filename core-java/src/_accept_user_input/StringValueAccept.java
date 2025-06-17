package _accept_user_input;


import java.util.Scanner;

public class StringValueAccept {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);

        //String StringValue = sc.next();//return only single word
        String StringValue = sc.nextLine();//return complete line
        System.out.println("you have entered " + StringValue);

    }

}
