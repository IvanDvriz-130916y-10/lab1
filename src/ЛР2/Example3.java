package ��2;

import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �����");
        int x = in.nextInt();

        if (x < 10) {
            System.out.println("��������� ����� ������ 10");
        }
        int result = (x % 4);

       if (result == 0) {
            System.out.println("����� ������� �� 4");
        } else {
            System.out.println("����� �� ������� �� 4");
        }
    }
}
