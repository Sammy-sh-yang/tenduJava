package io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

//OutputStreamWriter 他的老爸是 Writer
public class OSWDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("./txt/osw.txt");
        // OSW 是轉換流必須有他才可以轉換
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        // 不用一行一行 byte[] 的讀
        osw.write("啊啊啊啊啦啦啦我很帥");
        osw.write("爺爺也大廈");
        osw.close();

    }

}
