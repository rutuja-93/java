package _16_file_handling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo5Permissions {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.setWritable(false);
        System.out.println("file is set to read only");


    }
}