package io;

import java.io.*;

//ObjectOutputStream = oos
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String[] otherInfo = {"LALALL"};
        Person pp = new Person("Prisca", 12, "Female", otherInfo);
        System.out.println(pp);

        FileOutputStream fos = new FileOutputStream("./txt/person.txt");
        //Object to Binary. Save as Binary for long term save.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // If you want to use serialize, you MUST need to use Serialize interface.
        oos.writeObject(pp);
        System.out.println("Serializable Done!");
        oos.close();
    }
}
