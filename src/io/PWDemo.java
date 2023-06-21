package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("./txt/pwd.txt","UTF-8");

        pw.println("你好，我的名字是啦啦啦");
        pw.println("你好，我的名字是kkkk");

        pw.close();


    }

}
