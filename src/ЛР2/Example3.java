package ЛР2;

import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();

        if (x < 10) {
            System.out.println("Введенное число меньше 10");
        }
        int result = (x % 4);

       if (result == 0) {
            System.out.println("Число делится на 4");
        } else {
            System.out.println("Число не делится на 4");
        }
    }
}
