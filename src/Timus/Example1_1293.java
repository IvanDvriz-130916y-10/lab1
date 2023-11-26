package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example1_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int result = (A * (B * C)) * 2;

        out.println(result);
        out.flush();
    }
}
