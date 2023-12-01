package ЛР3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example1 {
    public Example1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("Введите число от 1 до 7");
        int x = scanner.nextInt();
        if (x <= 0) {
            out.println("Введено некорректное значение");
        }

        if (x >= 8) {
            out.println("Введено некорректное значение");
        }

        switch (x) {
            case 1:
                out.println("Понедельник");
                break;
            case 2:
                out.println("Вторник");
                break;
            case 3:
                out.println("Среда");
                break;
            case 4:
                out.println("Четверг");
                break;
            case 5:
                out.println("Пятница");
                break;
            case 6:
                out.println("Суббота");
                break;
            case 7:
                out.println("Воскресенье");
        }

        out.println();
        out.flush();
    }
}