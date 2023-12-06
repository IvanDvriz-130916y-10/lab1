package ЛР3;

import java.util.Scanner;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        byte a = scanner.nextByte();
        System.out.println("Введите второе число: ");
        byte b = scanner.nextByte();
        int x = a + b;
        System.out.println("Результат: " + x);
        for (int i = 0; x % 5 == 2; i++) {
            System.out.println("Сумма чисел делится на 5 с остатком 2");
            break;
        }
        for (int i = 0; x % 5 != 2; i++) {
            System.out.println("Сумма чисел НЕ делится на 5 с остатком 2");
            break;
        }
        for (int i = 0; x % 3 == 1; i++) {
            System.out.println("Сумма чисел делится на 3 с остатком 1");
            break;
        }
        for (int i = 0; x % 3 != 1; i++) {
            System.out.println("Сумма чисел НЕ делится на 3 с остатком 1");
            break;
        }
     }
}
