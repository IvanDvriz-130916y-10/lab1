package Timus;

import java.util.Scanner;
public class Example_2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x = 12 - a;
        int t = x * 45;
        if (t <= 4 * 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
