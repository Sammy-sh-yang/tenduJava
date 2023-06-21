package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        // Return as a byte int
        FileInputStream fis = new FileInputStream("./txt/osw.txt");

//        int read = fis.read();
        //這裏會報亂碼，因爲中文是3個字節
//        System.out.println((char) read);

        //return as a char int
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

//        int d = isr.read();

        int d;
        while ((d = isr.read()) != -1){
            System.out.print((char) d);
        }

        isr.close();

    }
}
