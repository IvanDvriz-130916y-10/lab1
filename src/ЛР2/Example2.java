package ��2;

import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� �����");
        int x = in.nextInt();

        int result = (x % 5);
        System.out.println("result" + result);
        if (result == 2){
            System.out.println("����� ������� �� 5 � �������� 2");
        } else {
            System.out.println("����� �� ������� �� 5 � �������� 2");
        }
        int result1 = (x % 7);
        if (result1 == 1) {
            System.out.println("����� ������� �� 7 � ��������� 1");
        } else {
            System.out.println("����� �� ������� �� 7 � ��������� 1");
        }
    }
}
