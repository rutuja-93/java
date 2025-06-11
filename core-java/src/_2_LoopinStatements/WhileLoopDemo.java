package _2_LoopinStatements;

public class WhileLoopDemo {
    public static void main(String[] args) {

        //---------------sum of digit-----------
         //seprate the digit
        // 123 % 10 ---> 3
        //123/10=12

        // 12 % 10 ---> 2
        //12/10=1

        //1 % 10 --> 1
        //1/10=0

        int number=12345;
        int sum=0;
        while (number>0){
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        System.out.println("sum=" +sum);



     // -------------------reverse number-------------------

//        int number1=12345;
//        int rev=0;
//        while (number1>0){
//            int digit=number1%10;
//           rev=rev*10+digit;
//            number1/=10;
//        }
//        System.out.println("rev is=" +rev);



        //-------------palindrome number-------------------121=121

   int num=122;
   int oldnum=num;
   int rev=0;
   while (num>0){
       int digit=num%10;
       rev=rev*10+digit;
       num/=10;
       //System.out.println("rev=" +oldnum);
   }
        System.out.println(oldnum==rev?"is palindrome":"is not palindrome");
    }

}

