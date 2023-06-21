package exception;

public class TryCatchDemo02 {
    public static void main(String[] args) {

        String i = "a";

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Hahah I catch you");
        }

        System.out.println("Program end");
    }

}
