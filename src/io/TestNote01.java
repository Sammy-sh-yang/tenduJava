package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestNote01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your file name:");
        String fileName = sc.nextLine();
        File file = new File("./txt/", fileName);
        FileOutputStream fos = new FileOutputStream(file);

        System.out.println("Write your text: (Enter \"exit\" to exit)");
        while (true) {
            String line = sc.nextLine();
            if ("exit".equalsIgnoreCase(line)) {
                break;
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }
        fos.close();
    }
}
