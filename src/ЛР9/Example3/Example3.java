package ��9.Example3;

// ������� ����������, ����������� ������ � ������� ����������
//������ ����� �����. ��� ����� � ������ ������� ����������� �����������
//������ ������ ������ for.2

import java.util.Scanner;
public class Example3 {

    // ����������� ����� ��� ����� �������
    private static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("������� ������� �������: ");
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, scanner);
        }
    }

    // ����������� ����� ��� ������ �������
    private static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            outputArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������ �������: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        inputArray(arr, 0, scanner); // �������� ����������� ����� ��� ����� �������

        System.out.print("������: ");
        outputArray(arr, 0); // �������� ����������� ����� ��� ������ �������

        scanner.close();
    }
}