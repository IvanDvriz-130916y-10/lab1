package ЛР3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int x = a + b;
        System.out.println("Результат: " + x);
        if (x % 5 == 2 ){
            System.out.println("Сумма чисел делится на 5 с остатком 2");
        } else {
            System.out.println("Сумма чисел НЕ делится на 5 с остатком 2");
        }
        if (x % 3 == 1 ){
            System.out.println("Сумма чисел делится на 3 с остатком 1");
        } else {
            System.out.println("Сумма чисел НЕ делится на 3 с остатком 1");
        }
    }
}
