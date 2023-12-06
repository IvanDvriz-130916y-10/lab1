package ЛР3;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int x;
        System.out.println("Последовательность чисел Фибоначчи: ");
        System.out.println(a);
        System.out.println(b);
        while (a >= 0) {
            x = a + b;
            a = b;
            b = x;
            System.out.println(x);
            if (x >= 100) {
                break;
            }
        }
    }
}
