package _14_string_handling;

public class Demo13split {
    public static void main(String[] args) {
        String str ="good morning everyone";
       String[] str1=str.split(",");

        for ( String temp : str1){
            System.out.println(temp);
        }
    }
}
