package file;

import java.io.File;
import java.util.Scanner;


public class FileDemo {
    public static void main(String[] args) {

        String filename = "./txt/txtFile.txt";
        File file = new File(filename);
        System.out.println(file.getName());
        System.out.println(file.length());


    }
}
