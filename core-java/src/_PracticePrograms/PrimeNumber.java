package _PracticePrograms;

public class PrimeNumber {

    public static void main(String[] args) {
        // prime number only divide by 1 or that particular number
        int number=15;
        boolean isPrime=true;
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime ? "Number is prime" : "number is not prime");
    }
}
