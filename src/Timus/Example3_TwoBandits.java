package Timus;

import java.io.PrintWriter;
import java.util.Scanner;
public class Example3_TwoBandits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = 10;
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.print(x - A + " " + (x - B));
    }
}