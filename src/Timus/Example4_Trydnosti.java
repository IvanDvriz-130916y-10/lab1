package Timus;

import java.io.PrintWriter;
import java.util.Scanner;
public class Example4_Trydnosti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();

        if (x >= 1 && x <= 4) {
            out.println("few");
        }
            if (x >= 5 && x <= 9){
                out.println("several");
        }
        if (x >= 10 && x <= 19){
            out.println("pack");
        }
        if (x >= 20 && x <= 49){
            out.println("lost");
        }
        if (x >= 50 && x <= 99){
            out.println("horde");
        }
        if (x >= 100 && x <= 249){
            out.println("throng");
        }
        if (x >= 250 && x <= 499){
            out.println("swarm");
        }
        if (x >= 500 && x <= 999){
            out.println("zounds");
        }
        if (x >= 1000){
            out.println("legion");
        }

        out.println();
        out.flush();
    }
}

