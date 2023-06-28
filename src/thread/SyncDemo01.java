package thread;

public class SyncDemo01 {

    public static void main(String[] args) {

        Table table = new Table();
        Thread t1 = new Thread("Prisca") {
            @Override
            public void run() {
                while (true){
                    int i = table.getBean();
                    System.out.println(getName() + ":" + i);
                }
            }
        };
        Thread t2 = new Thread("Sammy") {
            @Override
            public void run() {
                while (true){
                    int i = table.getBean();
                    System.out.println(getName() + ":" + i);
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class Table {

    private int bean = 20; //桌上有20豆子

    public int getBean() {
        if (bean <= 0) {
            throw new RuntimeException("There's no Beans");
        }
        return bean--;
    }
}
