package _PracticePrograms;

public class FactorialNumber {
    public static void main(String[] args) {
        //!6=6*5*4*3*2*1--720
        int number=6;
        int factorial=1;
        for (int i=1;i<=number;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
