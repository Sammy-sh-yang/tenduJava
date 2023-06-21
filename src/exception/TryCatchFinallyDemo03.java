package exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryCatchFinallyDemo03 {
    public static void main(String[] args) {
        try (FileOutputStream fis = new FileOutputStream("./txt/finally.txt")) {
            int i = 0;
            fis.write("hi".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}