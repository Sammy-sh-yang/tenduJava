package io;

import java.io.*;

public class CopyDemo01 {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();


        File pic = new File("./txt/demo/02.png");
        File outPic = new File("./txt/demo/02-1.png");

        FileInputStream fis = new FileInputStream(pic);
        FileOutputStream fos = new FileOutputStream(outPic);

        int temp;
        while ((temp = fis.read()) != -1){
            fos.write(temp);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        fos.close();
        fis.close();

    }
}
