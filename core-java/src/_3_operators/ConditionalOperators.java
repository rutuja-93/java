package _3_operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(true ? true : false);//true
        System.out.println(false ? false : true);//true

        System.out.println(number % 2 == 0 ? "Even number" : "odd number");



        int year = 2024;
        System.out.println(
                year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
                        ? "leap year" : "not a leap year");


    }
}
