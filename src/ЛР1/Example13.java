package ��1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �����: ");
        int one = in.nextInt();

        System.out.println("������� ������ �����: ");
        int two = in.nextInt();

        System.out.println("�� ��������: " + (one + two));
        in.close();
    }
}