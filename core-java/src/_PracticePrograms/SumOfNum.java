package _PracticePrograms;
import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st numvber");
        int n1 = scanner.nextInt();
        System.out.println("enter 2nd numvber");
        int n2 = scanner.nextInt();
        int sum=n1+n2;
        System.out.println("sum is " +sum);
    scanner.close();
    }
}

