package ��1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���� ������: ");
        String week = in.nextLine();

        System.out.println("������� �����: ");
        String month = in.nextLine();

        System.out.println("������� ����: ");
        int day = in.nextInt();

        System.out.println("�������: " + week + " " +day + " " + month);
        in.close();
    }
}
