package ��4;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ������������: ");
        byte V = scanner.nextByte();
        System.out.println("�����: " + V);
        for (int i = 1; i <= V; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}


