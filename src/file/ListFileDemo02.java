package file;

import java.io.File;
import java.io.FileFilter;

public class ListFileDemo02 {
    public static void main(String[] args) {

         // 過濾符合條件的子項
        String path = "./txt";
        File dir = new File(path);

        //FileFilter 是 接口interface 所以需要重寫方法
//        new FileFilter();
        FileFilter pathname = new FileSon();
        File[] listF = dir.listFiles(pathname);

        for (int i = 0; i < listF.length; i++) {
            System.out.println(listF[i]);
        }
    }
}

class FileSon implements FileFilter {
    //自定義過濾規則,會自動根據規定內容,過濾除符合的子項
    // accept() 可以 filter 文件的後綴
    @Override
    public boolean accept(File pathname) {
        String fileName = pathname.getName();
        System.out.println(fileName);
        boolean c = fileName.contains(".txt");
        return c;

    }
}
