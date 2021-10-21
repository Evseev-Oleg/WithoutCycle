package com.company;

import java.util.Scanner;

/**
 * выводит числа используя потоки
 * хотя то же что и рекурсия))
 */
public class Concurrent extends Thread{
    private int x = 1;
    private final int count;
    public Concurrent(int cnt){
        this.count = cnt;
    }
     private void increment() {

         if (x <= count) {
             if(x % 3 == 0) {
                 System.out.println(x++ + " Bar");
             } else {
                 System.out.println(x++ + " Foo");
             }
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException ignored) {
             }

             increment();
        }

     }

     public void run() {
        increment();
     }
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Concurrent concurrent = new Concurrent(count);
        concurrent.start();
        concurrent.join(100000);
        concurrent.interrupt();
        System.exit(0);
    }
}
