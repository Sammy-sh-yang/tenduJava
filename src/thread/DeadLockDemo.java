package thread;


//死鎖
public class DeadLockDemo {
    static Object chopsticks = new Object();
    static Object spoon = new Object();


    //彼此都無法釋放 spoon 和 chopsticks 的資源

    public static void main(String[] args) {

        Thread t1 = new Thread("North") {
            @Override
            public void run() {
                try {
                    System.out.println(getName() + ":starts to eat");
                    synchronized (chopsticks) {
                        System.out.println(getName() + ":Got chopsticks");
                        Thread.sleep(5000);
                        System.out.println(getName() + ":Done eating. need spoon.");
                    }
                    synchronized (spoon) {
                        System.out.println(getName() + ":Got spoon");
                        Thread.sleep(5000);
                        System.out.println("Put down spoon");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread("South") {
            @Override
            public void run() {
                try {
                    System.out.println(getName() + ":starts to eat");
                    synchronized (spoon) {
                        System.out.println(getName() + ":Got spoon");
                        Thread.sleep(5000);
                        System.out.println(getName() + ":Done eating. need Chopsticks.");
                    }

                    synchronized (chopsticks) {
                        System.out.println(getName() + ":Got chopsticks");
                        Thread.sleep(5000);
                        System.out.println("Put down chopsticks");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();
    }
}


