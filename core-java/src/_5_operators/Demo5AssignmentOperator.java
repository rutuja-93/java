package _5_operators;

public class Demo5AssignmentOperator {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1 * 2;
        int number3 = number2;
        int number4 = (int) Math.pow(2, 2);
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);
        System.out.println("number3: " + number3);
        System.out.println("number4: " + number4);
        System.out.println(number1 = 1000);
        //System.out.println(100=100);//CTE




        int num1 = 10;
        num1 += 10; //number1 = number1 + 10;
        System.out.println("Number is " + num1);//20

        int num2 = 10;
        num2 -= 5; //number2 = number2 - 5;
        System.out.println("Number is " + num2);//5

        int num3 = 10;
        num3 *= 3; //number3 = num3 * 3;
        System.out.println("Number is " + num3);//30

        int num4 = 10;
        num4 /= 3; //number4 = number4 /3; -->3
        System.out.println("Number is " + num4);//3

        int num5 = 10;
        num5 %= 3; // number5 = number5 % 3; --> 1
        System.out.println("Number is " + num5);//1



    }
}