package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OISTEST {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("./txt/car.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        CarTEST pp = (CarTEST) ois.readObject();
        System.out.println(pp);
        ois.close();


    }
}
