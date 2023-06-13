package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {

        String path = "./txt/newText.txt";
        File file = new File(path);

        if (file.exists()){
            file.delete();
            System.out.println("File is deleted");
        }else {
            System.out.println("File does not exist");
        }



    }
}
