package day2;

import java.util.Scanner;

/**
 * todo Document type Task4
 */
public class Task4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double x = SCANNER.nextDouble();
        double y = 0;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
        } else {
            y = 420;
        }
        System.out.println(y);
    }
}
