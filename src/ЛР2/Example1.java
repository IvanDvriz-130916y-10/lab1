package ��2;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �����");
        int x = in.nextInt();

        int result = x % 3;
        System.out.println(result);
        if (result == 0)
        {
            System.out.println("��������� ����� ������� �� ��� ��� �������");
        } else {
            System.out.println("��������� ����� �� ������� �� ��� ��� �������");
        }
    }
}
