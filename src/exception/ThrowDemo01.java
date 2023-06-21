package exception;

public class ThrowDemo01 {
    public static void main(String[] args) {
        Person pp = new Person();
        pp.setName("Sammy");
        try {
            pp.setAge(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pp);
    }
}
