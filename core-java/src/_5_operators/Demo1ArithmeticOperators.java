 package _5_operators;

public class Demo1ArithmeticOperators {
    public static void main(String[] args) {
        // +, -, *, /, %
        System.out.println(10 + 20);//30
        System.out.println(10 - 20);//-10
        System.out.println(10 * 20);//200
        System.out.println(10 / 20);//0 --> Quotient
        System.out.println(10 % 20);//10 --> Remainder




        System.out.println(1 / 10);//0
        System.out.println(1 % 10);//1
        System.out.println(11 / 10);//1
        System.out.println(11 % 10);//1
        System.out.println(0 / 1);//0
        System.out.println(0 % 1);//0
        System.out.println('A' + 'A');//130
        System.out.println('A' + 'B');//131



        System.out.println(10 + 20 - 10 * 10 / 1 + 10);//-60
        System.out.println(10 + (20 - 10) * 10 / 1 + 10);//120
        //System.out.println(10/0);//ArithmeticException
        //System.out.println(10 % 0);//ArithmeticException
        //System.out.println('A' % 0);//ArithmeticException
        System.out.println(10.0f / 0);//Infinity
        System.out.println(10.0f % 0);//NaN



        System.out.println(11.0 / 10);//1.1
        System.out.println(11.0 % 10);//1.0
        System.out.println(11 / 0.5);//22.0
        System.out.println(2000 * 0.05);//100.0
        System.out.println(200000 * 0.18);//36000.0
        //System.out.println(true + false);//CTE
        //System.out.println(true + true);//CTE
    }
}