package _PracticePrograms;

public class FactorsOfNum {
    public static void main(String[] args) {
        int number=100;
        for (int i=1;i<=number/2;i++){
            if (number%i==0){
                System.out.println(i);
            }
        }
    }
}
