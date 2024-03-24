package ��13.Example2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {9, 1, 1},
                {1, 2, 911},
                {1, 3, 91}
        };

        System.out.print("������� ����� �������: ");

        try {
            int columnNumber = Integer.parseInt(scanner.nextLine()) - 1; // ��������� �������� � 1

            if (columnNumber < 0 || columnNumber >= matrix[0].length) {
                System.out.println("������: ������� � ����� ������� ���");
            } else {
                System.out.println("������� " + (columnNumber + 1) + ":");
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][columnNumber]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("������: ������� �����!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("������: ������� � ����� ������� ���");
        }
    }
}