package ЛР3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = scanner.nextInt();
        if (a > 0) {
            Random random = new Random();
            int[] x  = new int [a];

            for (int i =0; i < x.length; i++){
                boolean iterator = true;
                int b = 0;
                while (iterator){
                    b = random.nextInt(100);
                    if (b % 5 ==2) {
                        iterator = false;
                    }
                }
                x [i] = b;
            }
            System.out.println(Arrays.toString(x));
        } else {
            System.out.println("Введено некорректное значение!");
        }
    }
}
