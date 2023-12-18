package Timus;

import java.util.Scanner;

public class Example1787 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int l = 0;

        for (int i =0; i<y;i++) {
            int q = scanner.nextInt();
            l = l + q - x;
            if (l < 0) {
                l =0;
            }
        }
        System.out.println(l);
    }
}
