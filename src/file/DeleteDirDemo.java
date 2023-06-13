package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {

        //一次只能刪除一個目錄, 不是空的目錄也不能刪除, 不過可以用for來刪除
        String path = "./txt/demo";
        File dir = new File(path);

        if (dir.exists()){
            dir.delete();
            System.out.println("Dir is deleted");
        }else {
            System.out.println("Dir does not exist");
        }


    }
}
