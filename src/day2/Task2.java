package day2;

import java.util.Scanner;

/**
 * Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
 * Используя цикл for, вывести все числа из диапазона между a и b,
 * которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.
 * Например, число 15 подходит под наше условие (делится на 5 без остатка и не делится на 10 без остатка),
 * но число 20 не подходит под наше условие (делится на 5 без остатка и делится на 10 без остатка).
 * Сами числа a и b в диапазоне не учитывать.
 */
public class Task2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static int a;

    private static int b;

    public static void checkCount(int a, int b){
        for (int i = a; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        a = SCANNER.nextInt();
        b = SCANNER.nextInt();
        checkCount(a,b);
    }
}
