package ��6;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("������� �����: ");
        int n = new Scanner(System.in).nextInt();
        int f = n % 2 == 0 ? 2 : 1;
        System.out.println( "�� �����: " + n + "\n" +"������� ��������� " + n + " = " + n * fact(n, f));
    }

    static int fact(int n, int f) {
        if (n <= f) {
            return 1;
        }
        n-=2;
        return n * fact(n, f);
    }
}
