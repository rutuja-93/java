package _PracticePrograms;

class Prime{
    public static void main(String[] args) {
        for (int n=2; n<=100; n++){
            boolean isPrime=true;
            for (int i=2;i<n;i++){
                if (n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(n +" is Prime");
            }
            else {
                System.out.println(n +" is not prime");
            }
        }
    }
}