package ��4;

import java.util.*;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ��� ����������: ");
        String shifr = scanner.nextLine();
        System.out.println("������� ����: ");
        int key = scanner.nextInt();

        char[] chars = shifr.toCharArray();
        int[] innt = new int[shifr.length()];

        System.out.println("chars �� ��������������: " + Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            innt[i] = chars[i] + key;
        }

        System.out.println("innt ����� ��������������: " + Arrays.toString(innt));

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) innt[i];
        }
        System.out.println("chars ����� ��������������: " + Arrays.toString(chars));

    }
}





