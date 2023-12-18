package Timus;

import java.util.Scanner;
public class Example1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        if (x1 % 2 ==0 || x2  % 2 !=0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

