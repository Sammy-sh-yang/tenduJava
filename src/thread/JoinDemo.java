package thread;

public class JoinDemo {
    static boolean isFinished = false;

    public static void main(String[] args) {


        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("Download image: " + i + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Image download complete!");
                isFinished = true;
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    //直到t1執行結束阻塞才會結束
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(5000);
                    System.out.println("Text is loaded");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (isFinished == false){
                    throw new RuntimeException("Text download failed");
                }
                System.out.println("Text download completed!");

            }
        };


        t1.start();
        t2.start();

    }
}
