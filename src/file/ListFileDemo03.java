package file;

import java.io.File;
import java.io.FileFilter;

public class ListFileDemo03 {
    public static void main(String[] args) {

         // 過濾符合條件的子項
        String path = "./txt";
        File dir = new File(path);

        //FileFilter 是 接口interface 所以需要重寫方法
//        new FileFilter();

        FileFilter f = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String fileName = pathname.getName();
//                System.out.println(fileName);
                boolean c = fileName.contains(".txt");
                return c;
            }
        };

        File[] files = dir.listFiles(f);
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

    }
}
