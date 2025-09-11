package _16_file_handling._03_writeDemos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2FileWriter {
    public static void main(String[] args) throws IOException {
        //FileWriter --> write characters to the file
        File file = new File("xyz.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        //multiple bytes writing
        fileWriter.write("\nHello World- FileWriter");
        //single byte wirte
        //fileWriter.write('B');
        System.out.println("write operation complete");
        fileWriter.close();
    }
}