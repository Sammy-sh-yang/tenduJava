package thread;

public class PriorityDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread("Sammy") {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName() + " round " + i);
                }
            }
        };

        Thread t2 = new Thread("Prisca") {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName() + " round " + i);
                }
            }
        };

        Thread t3 = new Thread("KLALA") {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName() + " round " + i);
                }
            }
        };

        t1.setPriority(1);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();


    }
}
