package _16_file_handling;

import java.io.File;
import java.io.FilenameFilter;

public class Demo10ListFileNamesFilter {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Admin\\Desktop\\java\\core-java\\src\\_16_file_handling");
        FilenameFilter fileNameFilter =(File dir, String name) ->name.startsWith("Demo1");
        String[] listOfFileNames = folder.list(fileNameFilter);
        for (String fileName : listOfFileNames) {
            System.out.println(fileName);
        }
    }
}