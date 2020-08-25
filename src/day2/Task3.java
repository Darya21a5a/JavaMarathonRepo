package day2;

import java.util.Scanner;

/**
 * Реализовать программу №2, используя цикл while.
 */
public class Task3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int a;

    private static int b;

    public static void checkCount(int a, int b){
        while (a < b){
            if (a % 5 == 0 && a % 10 != 0){
                System.out.println(a);
            }
            a ++;
        }
    }

    public static void main(String[] args) {
        a = SCANNER.nextInt();
        b = SCANNER.nextInt();
        checkCount(a,b);
    }
}
