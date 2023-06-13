package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        // 目的： 創建 new.txt 文件
        String path = "./txt/newText.txt";
        File file = new File(path);

        //進行boolean判斷文件是否創建成功
        if (file.exists()){
            System.out.println("File exist");
        }else{
            // 創建指定文件
            file.createNewFile();
            System.out.println("");
        }


    }
}
