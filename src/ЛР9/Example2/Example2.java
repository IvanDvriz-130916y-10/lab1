package ЛР9.Example2;

 // Создать приложение с использованием рекурсии для перевода целого числа, введенного с клавиатуры, в двоичную систему счисления.

import java.util.Scanner;
public class Example2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число для перевода в двоичную систему: ");
            int number = scanner.nextInt();

            String binary = convertToBinary(number);
            System.out.println("Число " + number + " в двоичной системе: " + binary);
        }

        public static String convertToBinary(int number) {
            // Базовый случай: если число равно 0, возвращаем "0"
            if (number == 0) {
                return "0";
            }

            // Рекурсивный случай: делим число на 2 и рекурсивно вызываем функцию с остатком от деления
            int quotient = number / 2;
            int remainder = number % 2;
            return convertToBinary(quotient) + remainder;
        }
    }

