package _PracticePrograms;

public class PerfectNumINRange {
    public static void main(String[] args) {

        for (int num=1;num<=10000;num++){
            int sum=0;
            for (int i=1;i<=num/2;i++){
                if (num%i==0){
                    sum+=i;
                }
            }
            if (sum==num){
                System.out.println("sum is " +num);
            }
        }
    }
}
