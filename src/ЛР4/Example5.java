package ËÐ4;

import java.util.*;
public class Example5 {
    public static void main(String[] args) {

        int[][] a = new int[3][5];
        Random random = new Random(15);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5; j++ ) {
                a[i][j] = random.nextInt(15);
                System.out.println(+ a [i][j]);
            }
        }
        System.out.println();

        int [] [] a2 = new int[5][3];
        for (int i =0; i < 5; i ++) {
            for (int j = 0; j < 3; j ++) {
                a2 [i] [j] = a [j] [i];
                System.out.println(+ a2 [i] [j]);
            }
            System.out.println();
        }
    }
}

