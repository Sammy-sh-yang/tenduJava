package thread;


/*
 * 線程提供的靜態方法
 */

import java.util.Scanner;

public class SleepDemo01 {
    public static void main(String[] args) {

        System.out.println("Program begin");
        try {
            System.out.println("Enter a count down number:");
            int time = new Scanner(System.in).nextInt();
            for (int num = time; num >= 0; num--) {
                System.out.println("Count down: " + num);
                Thread.sleep(1000);
            }
            System.out.println("Times up! Count down" + time + " ends");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Program end");

    }
}
