package Timus;

import java.util.Scanner;
public class Example4_1785 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (x >= 1 && x <= 4) {
            System.out.println("few");
        } else if (x >= 5 && x <= 9) {
                System.out.println("several");
        } else if (x >= 10 && x <= 19){
            System.out.println("pack");
        } else if (x >= 20 && x <= 49){
            System.out.println("lost");
        } else if (x >= 50 && x <= 99){
            System.out.println("horde");
        } else if (x >= 100 && x <= 249){
            System.out.println("throng");
        } else if (x >= 250 && x <= 499){
            System.out.println("swarm");
        } else if (x >= 500 && x <= 999){
            System.out.println("zounds");
        } else if (x >= 1000){
            System.out.println("legion");
         }
        System.out.flush();
    }
}

