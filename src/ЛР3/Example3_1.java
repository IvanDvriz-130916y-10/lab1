package ��3;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int a = scanner.nextInt();
        System.out.println("������� ������ �����: ");
        int b = scanner.nextInt();
        int x;
        System.out.println("������������������ ����� ���������: ");
        System.out.println(a);
        System.out.println(b);
        while (a >= 0) {
            x = a + b;
            a = b;
            b = x;
            System.out.println(x);
            if (x >= 100) {
                break;
            }
        }
    }
}
