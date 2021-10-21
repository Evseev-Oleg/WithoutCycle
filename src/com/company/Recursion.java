package com.company;

import java.util.Scanner;

/**
 * класс вывоводит числа
 * рекурсивным методом
 */
public class Recursion {
    private int x = 1;
    public void showNumbers(int i) {
        if (x <= i) {
            if (x % 3 == 0) {
                System.out.println(x++ + " Bar");
            } else {
                System.out.println(x++ + " Foo");
            }
            showNumbers(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Recursion r = new Recursion();
        r.showNumbers(number);
    }
}
