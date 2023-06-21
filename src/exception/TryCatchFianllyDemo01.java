package exception;

import java.io.FileOutputStream;
import java.util.Scanner;

public class TryCatchFianllyDemo01 {
    public static void main(String[] args) {
        System.out.println("Program running!");

        //cmd + option + T
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace(); //會 print 異常，同樣會跑完程序
        } finally {
            System.out.println("Finally 跑了"); //有跑 try 就一定會跑 finally
        }
        System.out.println("Program ends!");
    }
}
