package _14_string_handling;

public class Demo15StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer("Hello Word");
        stringBuffer.append("there");
        stringBuffer.insert(0,"Hii");
        stringBuffer.delete(3,6);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuffer sb= new StringBuffer("Hello World");
        sb.replace(0,1,"h");
        System.out.println(sb);
    }
}


