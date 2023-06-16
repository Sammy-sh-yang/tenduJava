package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./txt/txtFile.txt");
        String line = "你好";

        fos.write(line.getBytes(StandardCharsets.UTF_8));
        fos.close();

    }
}
