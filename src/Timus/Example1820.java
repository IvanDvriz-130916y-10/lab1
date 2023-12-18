package Timus;

import java.util.Scanner;

public class Example1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b >=a) {
            System.out.println(2);
        } else {
            if ((a * 2) % b == 0 ) {
                System.out.println((a * 2) / b);
            } else {
                System.out.println((a * 2) / b + 1);
            }
        }
    }
}
