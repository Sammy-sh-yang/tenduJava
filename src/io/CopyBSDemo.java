package io;

import java.io.*;

public class CopyBSDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./txt/demo/02.png");

        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("./txt/demo/02-bs.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long start = System.currentTimeMillis();
        int data;
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        bis.close();
        bos.close();

    }
}
