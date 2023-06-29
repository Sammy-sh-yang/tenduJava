package thread;


//同步
public class SyncDemo02 {
    public static void main(String[] args) {
        Shop s = new Shop();

        Thread t1 = new Thread("Sammy") {
            @Override
            public void run() {
                s.buy();
            }
        };
        Thread t2 = new Thread("Prisca") {
            @Override
            public void run() {
                s.buy();
            }
        };

        t1.start();
        t2.start();

    }
}

class Shop {

    //synchronized 同步所以每一個線程都會排隊進入方法

    public void buy() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":Enter shop");
            System.out.println(t.getName() + ":Pick clothes");
            Thread.sleep(5000);

            //同步塊 可以局部的進行讓線程排隊
            synchronized (this) {
                System.out.println(t.getName() + ":Is trying clothes");
                Thread.sleep(5000);
            }

            System.out.println(t.getName() + ":Check out clothes");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}