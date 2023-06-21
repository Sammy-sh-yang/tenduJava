package exception;

public class TryCatchDemo05 {
    public static void main(String[] args) {
        try {
            String str = "aaa";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("Hahah I catch you");
        } catch (Exception e){ // Exception 適用於任何異常方案
            System.out.println("都可捕捉的異常");
        }
        System.out.println("Program end");

    }
}
