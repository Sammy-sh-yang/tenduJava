package io;

import java.io.*;

public class CopyDemo02 {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        File pic = new File("./txt/demo/02.png");
        File outPic = new File("./txt/demo/02-2.png");

        FileInputStream fis = new FileInputStream(pic);
        FileOutputStream fos = new FileOutputStream(outPic);

        //塊讀有一個極限 optimize reading is 8~10kb
        byte[] data = new byte[10*1024];

        int len;
        while ((len = fis.read(data)) != -1){
            fos.write(data);
        }

        long end = System.currentTimeMillis();
        //Run time: 13ms VERY FAST!
        System.out.println("Run Time: " +( end - start));

        fos.close();
        fis.close();

    }
}
