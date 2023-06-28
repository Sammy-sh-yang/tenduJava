package thread;

public class SleepDemo02 {
    public static void main(String[] args) {

        Thread t1 = new Thread("Sammy") {
            @Override
            public void run() {
                System.out.println(getName() + ": Program start");
                try {
                    Thread.sleep(10000);
                    System.out.println(getName() + ": Sleep done");
                } catch (InterruptedException e) {
                    System.out.println(getName() + ": Sleep interrupted");
                }

            }
        };

        Thread t2 = new Thread("Prisca") {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(getName()+":Wake up Wake up");
                    } catch (InterruptedException e) {
                    }
                }
                t1.interrupt();
            }
        };

        t1.start();
        t2.start();

    }
}
