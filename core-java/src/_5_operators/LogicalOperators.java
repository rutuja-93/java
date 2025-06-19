package _5_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("************ Logical && Operator *************");
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false
        //System.out.println(10 && 3);/CTE


        System.out.println("************ Logical || Operator *************");
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true



        System.out.println("************ Logical ! Operator *************");
        System.out.println(!true);//false
        System.out.println(!false);//true


        ////leap year :  year which is divisible by 4 and if it is century year then it must be divisible by 400
//        int year=2024;
//        System.out.println(
//        int year = 2024;
//        System.out.println(
//                (year % 400 == 0)
//                        ||
//                        (year % 4 == 0
//                                &&
//                                year % 100 != 0)
//        );//true

    }
}
