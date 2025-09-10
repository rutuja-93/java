package _16_file_handling;

import java.io.File;

public class Demo9ListAllFileNames {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Admin\\Desktop\\java\\core-java\\src\\_16_file_handling");
        // it will return all file names in the given folder
        String[] listOfFileNames = folder.list();
      /*  for (int i = 0; i < listOfFileNames.length; i++) {
            System.out.println(listOfFileNames[i]);
        }*/

        for (String fileName : listOfFileNames) {
            System.out.println(fileName);
        }
    }
}