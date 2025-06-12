package _operators;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println("************ Relational Oprator *************");
        System.out.println(10 > 3);//true
        System.out.println(10 < 3);//false
        System.out.println(10 >= 3);//true
        System.out.println(10 <= 3);//fale
        System.out.println(10 == 3);//false
        System.out.println(10 != 3);//true
        //System.out.println(10!=true);//CTE
        System.out.println(10 % 3 == 0);//false

        int number=2024;
        System.out.println(number%100==0);//false
        System.out.println(number%4==0);//true
        System.out.println(number%100!=0);//true
        System.out.println(10%3!=1);//false
    }
}
