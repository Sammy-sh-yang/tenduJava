package exception;

public class TryCatchDemo03 {
    public static void main(String[] args) {

        try {
            String str = "";
            System.out.println(str.length());
            System.out.println(str.charAt(8));
        } catch (NullPointerException e) {
            System.out.println("Hahah I catch you");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
        System.out.println("Program end");
    }

}
