package thread;

public class SyncDemo01 {

    public static void main(String[] args) {

        Table table = new Table();
        Thread t1 = new Thread("Prisca") {
            @Override
            public void run() {
                while (true) {
                    int i = table.getBean();
                    System.out.println(getName() + ":" + i);
                }
            }
        };

        Thread t2 = new Thread("Sammy") {
            @Override
            public void run() {
                while (true) {
                    int i = table.getBean();
                    System.out.println(getName() + ":" + i);
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class Table{
    private int bean = 20; //桌上有20豆子

    //synchronized 不知道誰先誰後，同步

    // joined 是提前排好的順序，異步

    public synchronized int getBean() {
        if (bean <= 0) {
            throw new RuntimeException("There's no Beans");
        }

        Thread.yield(); //這方法，可以主動讓出時間片（禮讓線程）
        bean--;
        return bean;
    }
}
