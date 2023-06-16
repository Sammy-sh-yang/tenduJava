package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BOSFlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./txt/flush.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("hahahaha".getBytes(StandardCharsets.UTF_8));

        bos.flush(); //flush 方法會讓強制釋放輸出流bos緩存區的資料  .close -> 是調用 flush 導致緩存區釋放
    }
}
