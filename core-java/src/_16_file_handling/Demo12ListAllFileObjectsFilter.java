package _16_file_handling;

import java.io.File;
import java.io.FileFilter;

public class Demo12ListAllFileObjectsFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Admin\\Desktop\\java\\core-java\\src\\_16_file_handling");

        FileFilter fileFilter = fileObj -> fileObj.length() > 1000;
        File[] listOfFiles = folder.listFiles(fileFilter);
        for (File file : listOfFiles) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.lastModified());
        }

    }
}