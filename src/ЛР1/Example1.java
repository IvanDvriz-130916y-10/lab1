package ��1;

import java.util.Scanner;
public class Example1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("������� �������: ");
            String family = in.nextLine();
            System.out.println("������� ���: ");
            String name = in.nextLine();
            System.out.println("������� ��������:");
            String otchestvo = in.nextLine();
            System.out.println("Hello " + family + " "+ name  + " " + otchestvo);
        }
    }

