package thread;

public class ThreadDemo03 {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Hello");
                }
            }
        };

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("World");
                }
            }
        };



        //use lambda method

        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("kekekekek");
            }
        };

        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
        Thread t3 = new Thread(r2);
        t3.start();

    }
}
