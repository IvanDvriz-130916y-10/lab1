package ЛР3;

import java.util.Random;
import java.util.Scanner;

public class Example5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();
        int a = x + y;
        System.out.println("Сумма чисел: " + a);
        while (a % 5 == 2) {
            System.out.println("Сумма чисел делится на 5 с остатком 2");
            break;
        }
            while (a % 3 == 1) {
                System.out.println("Сумма чисел делится на 3 с остатком 1");
                break;
            }
                if (a % 5 != 2) {
                    System.out.println("Сумма чисел НЕ делится на 5 с остатком 2");
                }
                    if (a % 3 != 1) {
                        System.out.println("Сумма чисел НЕ делится на 3 с остатком 1");
                    }
            }

    }
