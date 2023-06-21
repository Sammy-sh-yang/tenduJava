package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSTEST {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./txt/car.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        CarTEST car = new CarTEST("Toyota",1200,"Sammy");
        oos.writeObject(car);

        oos.close();

    }
}
