package ЛР2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();

        if (x >= 5 && x <= 10) {
            System.out.println("Число попадает в диапозон");
        } else {
            System.out.println("Число НЕ попадает в диапозон");
        }
    }
}


