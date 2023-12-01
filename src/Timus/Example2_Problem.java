package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example2_Problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int b = in.nextInt();

        int result = x + b;

        out.println(result);
        out.flush();
    }
}
