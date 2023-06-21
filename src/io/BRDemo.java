package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./txt/noteWriter.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
    }
}
