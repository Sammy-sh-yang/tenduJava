package exception;

public class TryCatchDemo04 {
    public static void main(String[] args) {
        try {
            String str = "a";
            System.out.println(str.length());
            System.out.println(str.charAt(8));
        } catch (NullPointerException|StringIndexOutOfBoundsException e) {
            System.out.println("Hahah I catch you");
        }
        System.out.println("Program end");

    }
}
