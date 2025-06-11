package _2_LoopinStatements;

public class DoWhileDemo {
    public static void main(String[] args) {



        do{
            System.out.println("* * *");
            System.out.println("* * *");
        }while(false);


        //-------------multiplication table-----------
        int number = 0;
        do {
            number++;
            System.out.println(number*9);
        } while (number < 10);
    }
}
