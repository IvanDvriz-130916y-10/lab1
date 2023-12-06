package ËÐ3;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int x =10;
        char [] cool = new char[x];
        char [] good = new char[] {'A' , 'E', 'I', 'O', 'U', 'Y'};
        char b ='A';
        for (int i =0; i < x; i++) {
            Boolean bool = true;
            for ( int j = 0; j < good.length; j++)
            {
                if (b == good[j]) {
                    i--;
                    bool = false;
                    break;
                }
            }
            if (bool) {
                cool[i] = b;
            }
            b++;
    }
        for (int k = 0; k<x;k++){
            System.out.println(cool[k] + "\t");
        }
}
}