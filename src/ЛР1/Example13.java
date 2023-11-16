package ЛР1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int one = in.nextInt();

        System.out.println("Введите второе число: ");
        int two = in.nextInt();

        System.out.println("Вы получили: " + (one + two));
        in.close();
    }
}