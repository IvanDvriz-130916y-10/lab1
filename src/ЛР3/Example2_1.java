package ЛР3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите день недели!");
        String Day = scanner.next();
        if (Day.equals("Понедельник")) {
            System.out.println("1 день недели");
        } else if (Day.equals("Вторник")) {
                System.out.println("2 день недели");
            }
        else if (Day.equals("Среда")) {
            System.out.println("3 день недели");
        }
        else if (Day.equals("Четверг")) {
            System.out.println("4 день недели");
        }
        else if (Day.equals("Пятница")) {
            System.out.println("5 день недели");
        }
        else if (Day.equals("Суббота")) {
            System.out.println("6 день недели");
        }
        else if (Day.equals("Воскресенье")) {
            System.out.println("7 день недели");
        }
        else {
            System.out.println("Такого дня нет");
        }
    }
}
