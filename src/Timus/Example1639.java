package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class Example1639 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
    int result = (m * n) % 2;

        out.println ((result !=0) ? ("[second]=:]") : ("[:=[first]"));
        out.flush();
    }
}
