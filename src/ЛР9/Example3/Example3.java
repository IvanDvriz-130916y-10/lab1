package ЛР9.Example3;

// Создать приложение, позволяющее ввести и вывести одномерный
//массив целых чисел. Для ввода и вывода массива разработать рекурсивные
//методы вместо циклов for.2

import java.util.Scanner;
public class Example3 {

    // Рекурсивный метод для ввода массива
    private static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("Введите элемент массива: ");
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, scanner);
        }
    }

    // Рекурсивный метод для вывода массива
    private static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            outputArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        inputArray(arr, 0, scanner); // Вызываем рекурсивный метод для ввода массива

        System.out.print("Массив: ");
        outputArray(arr, 0); // Вызываем рекурсивный метод для вывода массива

        scanner.close();
    }
}