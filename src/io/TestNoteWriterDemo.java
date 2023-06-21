package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestNoteWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner ss = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("./txt/noteWriter.txt", true);
        PrintWriter pw = new PrintWriter(fos, true);

        System.out.println("Write anything! (Press \"1\" to exit)");

        while (true) {
            String userInput = ss.nextLine();
            if ("1".equalsIgnoreCase(userInput)) {
                break;
            }
            pw.println(userInput);
        }

        pw.close();
    }
}
