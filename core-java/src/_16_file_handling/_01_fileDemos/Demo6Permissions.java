package _16_file_handling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo6Permissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println("can we write to a file : " + file.canWrite());
    }
}