package _4_accept_user_input;

import java.util.Scanner;
public class factorsOfNumber {
    public static void main(String[] args) {
        System.out.println("enter number");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                System.out.println("facors are " +i);

            }
        }
    }
}
