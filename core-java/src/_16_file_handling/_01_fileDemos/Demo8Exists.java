package _16_file_handling._01_fileDemos;

import java.io.File;

public class Demo8Exists {
    public static void main(String[] args) {
        File file = new File("xyz.txt");
        System.out.println("whether file is present ? "+file.exists());//false
    }
}