package socket;

import java.util.Random;

public class TEST {

    public static void main(String[] args) {

        TEST t = new TEST();

        try {
            t.eat();
        } catch (WrongName wrongName) {
            wrongName.printStackTrace();
        }

    }

    public void eat() throws WrongName {
        Random rand = new Random();
        int x = rand.nextInt(2);
        if (x == 0) {
            throw new WrongName("Bro it's 0");
        } else {
            System.out.println(x);
        }

    }

}


class WrongName extends Exception {
    public WrongName() {
    }

    public WrongName(String message) {
        super(message);
    }

    public WrongName(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongName(Throwable cause) {
        super(cause);
    }

    public WrongName(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}