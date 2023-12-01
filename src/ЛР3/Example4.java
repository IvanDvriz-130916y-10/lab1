package ЛР3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        int x;
        for (int i = 0; i < a; i++) {
            x = i + 1;
            System.out.println(x);
        }
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int y;
        for (int q = 0; q < b; q++) {
            y = q + 1;
            System.out.println(y);
        }
    }
}
