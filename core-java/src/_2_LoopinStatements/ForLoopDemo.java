package _2_LoopinStatements;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            System.out.println("*");
        }


        // -------------Multiplication table----------



        for (int num=1; num<=10; num++){
            System.out.println(num*29);
        }




        //----------------factorial number----------5 × 4 × 3 × 2 × 1 = 120(5 ka fact)

      int number=3;
              for (int i=1;i<=number/2;i++) {
              if(number%i==0){
                  System.out.println( i);
              }
              }


        //uske chhote divisors ka total = woh number khud
        //find the factors of the given number
        // 6 factors are 1, 2,3
        //28 :: 1,2,4,7,14
        // maximum factor can be n/2
        //Perfect given number = sum of factors


        int number1=6;
              int sum=0;
        for (int i=1;i<=number1/2;i++) {
            if(number1%i==0){
                System.out.println( i);
                sum=sum+i;
                System.out.println(sum==number1?"is perfect":"is not perfect");
            }

        }

    }
}
