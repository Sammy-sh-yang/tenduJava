package exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryCatchFinallyDemo02 {
    public static void main(String[] args) {
        FileOutputStream fis = null;
        try {
            int i = 0;
            fis = new FileOutputStream("./txt/finally.txt");
            fis.write("hi".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}