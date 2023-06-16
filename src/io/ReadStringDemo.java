package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./txt/note.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);

        String str = new String(b, StandardCharsets.UTF_8);
        System.out.println(str);
    }
}
