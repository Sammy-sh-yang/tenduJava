package io;

import apple.laf.JRSUIConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FISDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./txt/txtFile.txt");

        int temp;
        while ( (temp = fis.read())!= -1 ){
            System.out.print((char) temp);
        }

        fis.close();

    }
}
