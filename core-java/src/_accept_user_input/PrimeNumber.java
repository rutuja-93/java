package _accept_user_input;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        boolean isPrime=true;

        for (int i=2; i<=num/2;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime?"Prime":"Not prime");
    }
}
