package _5_operators;

public class BitwiseOprators{
    public static void main(String[] args) {
        System.out.println("************ Bitwise & Operator *************");
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false


        System.out.println("************ Bitwise | Operator *************");
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

        System.out.println("************ Bitwise XOR ^ Operator *************");
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true



        System.out.println(4 & 3);//0
        // 4 ---> 1 0 0
        // 3 ---> 0 1 1
        //---------------
        // 0 <--- 0 0 0
        System.out.println(4 & 5);//4
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        //---------------
        // 4 <--- 1 0 0


        System.out.println(4 | 3);//7
        // 4 ---> 1 0 0
        // 3 ---> 0 1 1
        //---------------
        // 7 <--- 1 1 1
        System.out.println(4 | 5);//5
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        //---------------
        // 5 <--- 1 0 1



        System.out.println(4 ^ 3);//7
        // 4 ---> 1 0 0
        // 3 ---> 0 1 1
        //---------------
        // 7 <--- 1 1 1
        System.out.println(4 ^ 5);//1
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        //---------------
        // 1 <--- 0 0 1


        System.out.println(~4);//-5
        System.out.println(~3);//-4
        System.out.println(~-5);//4
        System.out.println(~-4);//3

        //shift the bits of 4 to the left by 1 places
        System.out.println(4 << 1);//8
        // operand1 * 2^operand2 = 4 * 2^1 ---> 8
        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32

        //shift the bits of 4 to the right by 1 places
        System.out.println(4 >> 1);//2
        // operand1 / 2^operand2 = 4 / 2^1 ---> 2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0
        //4 / 2^3 ---> 4 /8 ---> 0


    }
}
