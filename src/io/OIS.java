package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//ObjectInputStream = ois
public class OIS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("./txt/person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 原來的 Person 類型變成了 Object 類型
        //向上造型了，變成 person 失去了原來的的特點。 所以不能掉原來的方法了
        // Object pp = ois.readObject();
        Person pp = (Person) ois.readObject(); //需要強轉成 Person類
        System.out.println("Serializable Done!");
        System.out.println(pp);
        ois.close();

    }
}
