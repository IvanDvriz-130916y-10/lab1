package ��1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �����: ");
        String month = in.nextLine();

        System.out.println("������� ������� ���� � ������: ");
        int quantity = in.nextInt();

        System.out.println(month + " �������� " + quantity + " ����\n");
        in.close();
    }
}