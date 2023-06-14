package test;

import java.io.File;
import java.io.FileFilter;

public class recurssionDemo {
    public static void main(String[] args) {

        // find all the file in the directory

        File dir = new File("./txt/");
        FileFilter ff = pathname -> pathname.getName().contains(".txt");

        if (dir.isDirectory()) {
            File[] lf = dir.listFiles(ff);
            System.out.println("Num of sub-dir: " + lf.length);
            for (int i = 0; i < lf.length; i++) {
                if (lf[i].isFile()) {
                    System.out.println("File: " + lf[i]);
                } else {
                    System.out.println("Dir: " + lf[i]);
                }
            }
        } else {
            System.out.println("Not Dir:" + dir.getName());
        }
    }

}
