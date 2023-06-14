package lambda;

import java.io.File;
import java.io.FileFilter;

public class lambdaDemo {
    /*
     * lambda 表達式
     * JDK 之後才推出的
     * 可使用用於精簡的方式創建匿名內部類
     * 什麼時候可以使用 lambda ??
     */
    public static void main(String[] args) {

        // 1. 傳統的匿名內部類
        // 什麼是匿名內部類??
        FileFilter f = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String fileName = pathname.getName();
                boolean c = fileName.contains(".txt");
                return c;
            }
        };

        // 2. 用 lambda 方式精簡: 可以省略接口名和方法名
        // 1. delete 接口名 new FileFilter()
        // 2. delete 方法名 public boolean accept
        // 3. 將方法參數移植到等號右側, 並使用 -> 和 { 相連
        FileFilter f2 = (File pathname) -> {
            String fileName = pathname.getName();
            boolean c = fileName.contains(".txt");
            return c;
        };

        // 3. 刪掉參數類型 File
        FileFilter f3 = (pathname) -> {
            String fileName = pathname.getName();
            boolean c = fileName.contains(".txt");
            return c;
        };

        //4. 如果參數只有一個參數時, "()" 也可以刪除
        FileFilter f4 = pathname -> {
            String fileName = pathname.getName();
            boolean c = fileName.contains(".txt");
            return c;
        };

        //5. 將方法體的內容變成一句話
        FileFilter f5 = pathname -> {
            return pathname.getName().contains(".txt");
        };

        //6.如果方法體中只有一句code, 可以將方法體的{} 刪除, 如果有return,也要將return 刪除
        FileFilter f6 = pathname -> pathname.getName().contains(".txt");

    }
}
