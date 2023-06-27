package thread;

public class ThreadDemo01 {
    public static void main(String[] args) {
        myThread01 t1 = new myThread01();
        myThread02 t2 = new myThread02();

        t1.start();
        t2.start();

    }
}

class myThread01 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("hello");
        }

    }

}

class myThread02 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("world");
        }
    }
}