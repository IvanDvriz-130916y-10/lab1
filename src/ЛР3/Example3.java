package ËÐ3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x;
        for (int i = 1; i < 10; i ++) {
            x = a + b;
            a = b;
            b = x;
            System.out.println(x);
        }
    }
}
