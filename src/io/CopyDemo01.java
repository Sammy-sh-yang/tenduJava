package io;

import java.io.*;

public class CopyDemo01 {
    public static void main(String[] args) throws IOException {


        // 缺點是這個 io 方法速度慢, 爲什麼? 因爲他是在硬盤中運算, 單字節讀取
        // 電磁訊號轉換 (電內存中)(磁硬盤中)
        //

        long start = System.currentTimeMillis();

        File pic = new File("./txt/demo/02.png");
        File outPic = new File("./txt/demo/02-1.png");

        FileInputStream fis = new FileInputStream(pic);
        FileOutputStream fos = new FileOutputStream(outPic);

        System.out.println("Size: "+ fis.available());

        int temp;
        while ((temp = fis.read()) != -1){
            fos.write(temp);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        fos.close();
        fis.close();

    }
}
