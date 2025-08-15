package _14_string_handling;

public class Demo12charAt {
    public static void main(String[] args) {
        String str= "good morning";
        System.out.println(str.charAt(2));//o


        System.out.println("Reading char by char");
        for (int index=0; index<str.length();index++){
            System.out.println(str.charAt(index));
        }
        System.out.println(str.indexOf("d"));//3
    }
}
