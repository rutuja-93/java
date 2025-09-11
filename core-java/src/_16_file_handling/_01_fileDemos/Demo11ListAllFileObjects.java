package _16_file_handling._01_fileDemos;

import java.io.File;

public class Demo11ListAllFileObjects {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Admin\\Desktop\\java\\core-java\\src\\_16_file_handling");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.lastModified());
        }

    }
}