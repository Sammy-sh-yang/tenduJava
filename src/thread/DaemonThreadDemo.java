package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread("Prisca") {
            @Override
            public void run() {
                System.out.println("Program Start");
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }

                }
                System.out.println("Program end");

            }
        };

        Thread t2 = new Thread("Sammy") {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t1.start();
        //用戶線程（main 和 t1）守護線程 （t2）； 用戶線程結束後守護線程會自己被殺掉
        t2.setDaemon(true);
        t2.start();
    }
}
