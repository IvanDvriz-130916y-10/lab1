package ��3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int a = scanner.nextInt();
        System.out.println("������� ������ �����: ");
        int b = scanner.nextInt();
        int x = a + b;
        System.out.println("���������: " + x);
        if (x % 5 == 2 ){
            System.out.println("����� ����� ������� �� 5 � �������� 2");
        } else {
            System.out.println("����� ����� �� ������� �� 5 � �������� 2");
        }
        if (x % 3 == 1 ){
            System.out.println("����� ����� ������� �� 3 � �������� 1");
        } else {
            System.out.println("����� ����� �� ������� �� 3 � �������� 1");
        }
    }
}
