package ЛР13.Example2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int sum = 0;
        int count = 0;

        // Запрашиваем у пользователя размер массива
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();

        int[] array = new int[size];

        // Заполняем массив элементами, обрабатывая возможные ошибки
        for (int i = 0; i < size; i++) {
            try {
                System.out.print("Введите элемент массива: ");
                array[i] = Integer.parseInt(scanner.next());

                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число!");
                i--; // Повторяем ввод для этого элемента
            }
        }

        // Проверяем, есть ли положительные элементы в массиве
        if (count == 0) {
            System.out.println("Ошибка: положительные элементы отсутствуют");
        } else {
            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);
        }
    }
}
