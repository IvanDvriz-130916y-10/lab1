package ЛР1;

import java.util.Arrays;
import java.util.Scanner;

public class Example14 {
            public static void main (String[]args){
                Scanner in = new Scanner(System.in);
                System.out.println("Введите число: ");
                int one = in.nextInt();
                int two = (one -1 + one + one + 1);
                System.out.println((one - 1) + " " + one + " " + (one + 1) + " " + (two * two ));
                in.close();
            }
    }
