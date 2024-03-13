package ��11;

//        �������� �������, ������� ��������� �� ���� ������ ����� ����� �
//        ���������� ����� ������, ���������� ������ ������ ����� �� ��������� �������.

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = filterEvenNumbers(originalArray);

        System.out.println("�������� ������: " + Arrays.toString(originalArray));
        System.out.println("����� ������ � ������� �������: " + Arrays.toString(newArray));
    }

    public static int[] filterEvenNumbers(int[] array) {
        int count = 0;

        // ������� ���������� ������ ����� � �������� �������
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // �������� ������ ������� � ������� �������
        int[] result = new int[count];
        int index = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
}