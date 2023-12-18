package Timus;

import java.util.Scanner;
public class Example2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int x1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int x3 = scanner.nextInt();

        int result2 = x1 -x2;
        int result1 = x3 - result2 - x2;

        System.out.println(result1 + " " + result2);
    }
}
