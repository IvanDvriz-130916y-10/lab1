package ��3;

import java.util.Scanner;

public class Example3 {
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
        for (int i = 1; i < 10; i ++) {
            x = a + b;
            a = b;
            b = x;
            System.out.println(x);
        }
    }
}
