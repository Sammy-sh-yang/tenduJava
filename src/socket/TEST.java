package socket;

import java.util.Random;

public class TEST {
    public static void main(String[] args) {

        TEST t = new TEST();
        try {
            t.eat();
        } catch (NumberErrorException e) {
            e.printStackTrace();
        }
    }

    public void eat() throws NumberErrorException{
        Random rand = new Random();
        int num = rand.nextInt(2);
        if (num == 0) {
            throw new NumberErrorException("The number cannot be 0");
        } else {
            System.out.println(num);
        }
    }

}

class NumberErrorException extends Exception{
    public NumberErrorException() {
    }

    public NumberErrorException(String message) {
        super(message);
    }

    public NumberErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberErrorException(Throwable cause) {
        super(cause);
    }

    public NumberErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

