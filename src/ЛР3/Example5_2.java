package ��3;

import java.util.Random;
import java.util.Scanner;

public class Example5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int x = scanner.nextInt();
        System.out.println("������� ������ �����: ");
        int y = scanner.nextInt();
        int a = x + y;
        System.out.println("����� �����: " + a);
        while (a % 5 == 2) {
            System.out.println("����� ����� ������� �� 5 � �������� 2");
            break;
        }
            while (a % 3 == 1) {
                System.out.println("����� ����� ������� �� 3 � �������� 1");
                break;
            }
                if (a % 5 != 2) {
                    System.out.println("����� ����� �� ������� �� 5 � �������� 2");
                }
                    if (a % 3 != 1) {
                        System.out.println("����� ����� �� ������� �� 3 � �������� 1");
                    }
            }

    }
