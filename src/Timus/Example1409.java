package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a + b -1 ;

        int h = x - a ;
        int l = x -b;

        out.println(h + " " + l);
        out.flush();
    }
}
