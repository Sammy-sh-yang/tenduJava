package thread;

public class ThreadDemo02 {
    public static void main(String[] args) {

        MyRunnable01 r1 = new MyRunnable01();
        MyRunnable02 r2 = new MyRunnable02();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}

class MyRunnable01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello");
        }
    }
}

class MyRunnable02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("world");
        }
    }
}