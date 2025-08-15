package _14_string_handling;

public class Demo7CompareTo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("A"));//0=65-65
        System.out.println("A".compareTo("B"));//-1=65-66
        System.out.println("B".compareTo("A"));//1=66-65
    }
}