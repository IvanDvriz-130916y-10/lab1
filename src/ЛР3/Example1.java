package ��3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example1 {
    public Example1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("������� ����� �� 1 �� 7");
        int x = scanner.nextInt();
        if (x <= 0) {
            out.println("������� ������������ ��������");
        }

        if (x >= 8) {
            out.println("������� ������������ ��������");
        }

        switch (x) {
            case 1:
                out.println("�����������");
                break;
            case 2:
                out.println("�������");
                break;
            case 3:
                out.println("�����");
                break;
            case 4:
                out.println("�������");
                break;
            case 5:
                out.println("�������");
                break;
            case 6:
                out.println("�������");
                break;
            case 7:
                out.println("�����������");
        }

        out.println();
        out.flush();
    }
}