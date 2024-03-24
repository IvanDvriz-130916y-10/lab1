package ��13.Example2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int sum = 0;
        int count = 0;

        // ����������� � ������������ ������ �������
        System.out.print("������� ������ �������: ");
        size = scanner.nextInt();

        int[] array = new int[size];

        // ��������� ������ ����������, ����������� ��������� ������
        for (int i = 0; i < size; i++) {
            try {
                System.out.print("������� ������� �������: ");
                array[i] = Integer.parseInt(scanner.next());

                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("������: ������� �����!");
                i--; // ��������� ���� ��� ����� ��������
            }
        }

        // ���������, ���� �� ������������� �������� � �������
        if (count == 0) {
            System.out.println("������: ������������� �������� �����������");
        } else {
            double average = (double) sum / count;
            System.out.println("������� �������� ����� ������������� ���������: " + average);
        }
    }
}
