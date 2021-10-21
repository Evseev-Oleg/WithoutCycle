package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * класс выводит числа
 * методом переопределения toString()
 */
public class Redefinition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Object[] numbers = new Object[number];
        Arrays.fill(numbers, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return ++count % 3 == 0 ? count + " Bar" : count + " Foo";
            }
        });
        System.out.println(Arrays.toString(numbers));
    }
}
