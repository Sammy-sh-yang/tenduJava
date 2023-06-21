package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fosTEST {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("./txt/newText.txt",true);
        String a = "Hello world!";
        fos.write(a.getBytes());
        fos.close();

    }

}
