package day2;

import java.util.Scanner;

/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число, соответствующее количеству этажей в здании.
 * Используя условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
 *
 * Условия:
 * если этажей 1-4  - “Малоэтажный дом”,
 * 5-8 - “Среднеэтажный дом”,
 * 9 и более - “Многоэтажный дом”.
 * Так же, необходимо учесть что может быть введено отрицательное значение. В таком случае сообщить о некорректности ввода.
 */
public class Task1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static boolean flag = true;
    public static void main(String[] args) {
        int countFloor = SCANNER.nextInt();
        while (flag){
            if(countFloor == 0 || countFloor < 0){
                System.out.println("Неверное значение");
                countFloor = SCANNER.nextInt();
            }
            else {
                flag = false;
            }
        }
        System.out.println("Твой дом = " + checkFloor(countFloor));
    }

    public static String checkFloor(int countFloor){
        if (countFloor < 0 || countFloor == 0){
            throw new IllegalArgumentException();
        }
        else if (countFloor >= 1 && countFloor <= 4) {
            return "Малоэтажный дом";
        }
        else if (countFloor >= 5 && countFloor <= 8) {
            return "Среднеэтажный дом";
        }
        else {
            return "Многоэтажный дом";
        }
    }
}

