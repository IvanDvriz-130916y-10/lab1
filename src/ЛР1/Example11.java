package ЛР1;

import java.util.Scanner;

public class Example11 {

    public static void main(String[] args) {

        int year = 2023;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя : ");
        String name = in.nextLine();

        System.out.println("Введите год вашего рождения : ");
        int quantity = in.nextInt();

        System.out.println(name + " " + (year - quantity) + " лет\n");
        in.close();
    }
}
