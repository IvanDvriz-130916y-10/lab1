package ��3;

import java.util.Scanner;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        byte a = scanner.nextByte();
        System.out.println("������� ������ �����: ");
        byte b = scanner.nextByte();
        int x = a + b;
        System.out.println("���������: " + x);
        for (int i = 0; x % 5 == 2; i++) {
            System.out.println("����� ����� ������� �� 5 � �������� 2");
            break;
        }
        for (int i = 0; x % 5 != 2; i++) {
            System.out.println("����� ����� �� ������� �� 5 � �������� 2");
            break;
        }
        for (int i = 0; x % 3 == 1; i++) {
            System.out.println("����� ����� ������� �� 3 � �������� 1");
            break;
        }
        for (int i = 0; x % 3 != 1; i++) {
            System.out.println("����� ����� �� ������� �� 3 � �������� 1");
            break;
        }
     }
}
