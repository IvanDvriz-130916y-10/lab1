package ��3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ���� ������!");
        String Day = scanner.next();
        if (Day.equals("�����������")) {
            System.out.println("1 ���� ������");
        } else if (Day.equals("�������")) {
                System.out.println("2 ���� ������");
            }
        else if (Day.equals("�����")) {
            System.out.println("3 ���� ������");
        }
        else if (Day.equals("�������")) {
            System.out.println("4 ���� ������");
        }
        else if (Day.equals("�������")) {
            System.out.println("5 ���� ������");
        }
        else if (Day.equals("�������")) {
            System.out.println("6 ���� ������");
        }
        else if (Day.equals("�����������")) {
            System.out.println("7 ���� ������");
        }
        else {
            System.out.println("������ ��� ���");
        }
    }
}
