package file;

import java.io.File;

public class mkdirDemo {
    public static void main(String[] args) {
        String path = "./txt/demo/a";
        File dir = new File(path);

        if (dir.exists()){
            System.out.println("Directory is already created");
        }else {
            dir.mkdirs();
            System.out.println("Directory is created");
        }


    }
}
