package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FOSDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("./txt/txtFile.txt");

        //1. 創建 FileOutputStream 實例對象,並綁定文件
        FileOutputStream fos = new FileOutputStream(file,true);

        //2. 向文件寫單字節數據
        // int -> 對應的2進制數據
        fos.write(97); // a 對應的unicode 是 97， 所以會寫 a

        //3. 可以寫一串字符串 -> into byte 數組, so 需要 .getByte 來轉換成byte
        fos.write("Hello world".getBytes());

        //4. 寫字節的一部分 write(byte b[], int off, int len)
        //
        fos.write("God is a girl".getBytes(),4,9);
        fos.close();

    }
}
