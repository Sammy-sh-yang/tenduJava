package file;

import java.io.File;

public class RecursionDemo {
    public static void main(String[] args) {
        String path = "./txt";
        File dir = new File(path);

        // Implement recursion
        recursionFolder(dir);
    }

    private static void recursionFolder(File dir) {
        //判斷是否爲文件(防止第一次傳入是文件)
        if (dir.isFile()) {
            System.out.println("File cannot be in recursion");
            return;
        } else {
            //進入到這的話是 directory
            File[] listFiles = dir.listFiles();
            //loop listFiles
            for (int i = 0; i < listFiles.length; i++) {

                if (listFiles[i].isFile()) {
                    //走到這個步表示是 Files 了
                    System.out.println("File: " + listFiles[i]);
                } else {
                    //走到這步表示是目錄了
                    System.out.println("Directory: " + listFiles[i]);
                    //當前這個目錄爲根,獲取目錄的子項
                    recursionFolder(listFiles[i]);
                }
            }

        }
    }
}
