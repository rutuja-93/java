package _5_operators;

public class Demo7DigitSeparation {
    public static void main(String[] args) {
        //mod, divide
        int number = 123;
        int sum = 0;
        int digit = number % 10;//3
        sum = sum + digit; // sum +=digit;

        number = number / 10; // number /=10;
        digit = number % 10; //2
        sum = sum + digit;

        number = number / 10;
        digit = number % 10;//1
        sum = sum + digit;
        System.out.println("sum of digits of the given number is " + sum);




        //using while

        int number1 = 123456789;
        int sum1 = 0;

        while (number != 0) {
            //mod, divide
            int digit1 = number % 10;
            sum1 = sum1 + digit1;
            number1 = number1 / 10;
        }

        System.out.println("sum of digits of the given number is " + sum1);
    }
}
