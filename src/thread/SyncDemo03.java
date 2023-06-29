package thread;

// 互斥鎖，兩個行爲不允許同時進行
public class SyncDemo03 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();

        Thread t1 = new Thread("Sammy") {
            @Override
            public void run() {
                monkey.eat();
            }
        };
        Thread t2 = new Thread("Prisca") {
            @Override
            public void run() {
                monkey.breath();
            }
        };

        t1.start();
        t2.start();

    }
}


class Monkey {
    public synchronized void eat() {
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName() + ":Eat Banana");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + ":Done eating");
    }


    public synchronized void breath() {
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName() + ":Breathing");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + ":Done breathing");
    }
}

