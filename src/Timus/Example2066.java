package Timus;

import java.util.Scanner;

public class Example2066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b == 0 || b == 1 || c == 1 ) {
            System.out.println(a-b-c);
        } else  {
            System.out.println(a-b*c);
        }
    }
}
