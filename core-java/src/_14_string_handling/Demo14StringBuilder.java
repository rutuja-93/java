package _14_string_handling;

public class Demo14StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("Hello Word");
        stringBuilder.append("there");
        stringBuilder.insert(0,"Hii");
        stringBuilder.delete(3,6);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
