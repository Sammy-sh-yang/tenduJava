package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        //只能獲取一個目錄的子項 --> 一層子項

        File file = new File(".");

        // 判斷dir 是否是目錄, 不是目錄就算了
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            System.out.println("List of directory and files: " + listFiles.length);
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    System.out.println("File: " + listFiles[i].getName());
                } else {
                    System.out.println("Directory: " + listFiles[i].getName());
                }
            }
        } else {
            System.out.println("no Directory");
        }

    }
}
