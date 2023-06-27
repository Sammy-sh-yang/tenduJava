package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();

        System.out.println(t1);

        Thread t2 = new Thread("hhhaaa"){
            @Override
            public void run() {
                System.out.println("t2");
                Thread t = Thread.currentThread();
                System.out.println(t);

            }
        };
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                System.out.println(t);
            }
        });
        t3.start();

    }
}
