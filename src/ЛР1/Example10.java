package ��1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        int year = 2023;

        Scanner in = new Scanner(System.in);
        System.out.println("������� ��� ������ �������� : ");
        int quantity = in.nextInt();

        System.out.println("��� " + (year - quantity) + " ���\n");
        in.close();
    }
}
