package ��2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �����");
        int x = in.nextInt();

        if (x >= 5 && x <= 10) {
            System.out.println("����� �������� � ��������");
        } else {
            System.out.println("����� �� �������� � ��������");
        }
    }
}


