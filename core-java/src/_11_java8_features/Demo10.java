package _11_java8_features;

public class Demo10 {
    public static void main(String[] args) {
        interface Processor{
            int process(int number1, int number2);
        }
//        Processor processor = (num1, num2) -> num1 + num2;
        Processor processor = Integer::sum;
        System.out.println("addition is "+processor.process(3, 4));//7

    }
}
