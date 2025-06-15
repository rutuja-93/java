package _PracticePrograms;

public class PerfectNum {
    public static void main(String[] args) {

        //Perfect given number = sum of factors
        int number=50;
        int sum=0;
        for (int i=1;i<=number/2;i++){
            if (number%i==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum==number ? "number is perfect" : "number is not perfect");
    }
}
