package _4_accept_user_input;

import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int factorial=1;
        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("factorial is " +factorial);
    }
}
