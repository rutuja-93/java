package _1_ConditionalStatements;

public class ConditionalStatements {
    //    -------1 if else---------
    public static void main(String[] args) {
        int number = 12;
        if (number % 2 == 0) {
            System.out.println("number is even " + number);
        } else {
            System.out.println("number is odd " + number);
        }


//          -------------2 else if---------


        int number1 = 1000;
        int number2 = 200;
        int number3 = 300;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is maximum");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is maximum");
        } else {
            System.out.println(number3 + " is maximum");
        }


//  -------------3 switch statement---------


        int month=15;
        switch (month){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }


    }
}