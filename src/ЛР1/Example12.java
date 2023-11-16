package ЛР1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        int year = 2023;

        Scanner in = new Scanner(System.in);
        System.out.println("Сколько вам лет? : ");
        int quantity = in.nextInt();

        System.out.println("Вы " + (year - quantity) + " года рождения\n");
        in.close();
    }
}
