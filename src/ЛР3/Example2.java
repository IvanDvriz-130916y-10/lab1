package ЛР3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example2 {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);
            System.out.println("Введите число от 1 до 7");
            String Day = scanner.nextLine();
            String monday = "Понедельник";
            String tuesday = "Вторник";
            String wednesday = "Среда";
            String thursday = "Четверг";
            String friday = "Пятница";
            String saturday = "Суббота";
            String sunday = "Воскресенье";
            switch (Day) {
                case "Понедельник":
                    out.println("1");
                    break;
                case "Вторник":
                    out.println("2");
                    break;
                case "Среда":
                    out.println("3");
                    break;
                case "Четверг":
                    out.println("4");
                    break;
                case "Пятница":
                    out.println("5");
                    break;
                case "Суббота":
                    out.println("6");
                    break;
                case "Воскресенье":
                    out.println("7");
            }

            out.println();
            out.flush();
        }
    }

