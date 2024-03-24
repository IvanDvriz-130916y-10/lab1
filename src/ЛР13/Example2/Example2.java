package ЛР13.Example2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {9, 1, 1},
                {1, 2, 911},
                {1, 3, 91}
        };

        System.out.print("Введите номер столбца: ");

        try {
            int columnNumber = Integer.parseInt(scanner.nextLine()) - 1; // Нумерация столбцов с 1

            if (columnNumber < 0 || columnNumber >= matrix[0].length) {
                System.out.println("Ошибка: столбца с таким номером нет");
            } else {
                System.out.println("Столбец " + (columnNumber + 1) + ":");
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][columnNumber]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите число!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: столбца с таким номером нет");
        }
    }
}