package ЛР3;

import java.io.PrintWriter;
import java.util.Scanner;
public class Example2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("Введите число от 1 до 7");
        String Day = scanner.nextLine();
        String Понедельник;

        switch (Day) {
        case  Понедельник:
        out.println("1");
        break;
        case  2:
        out.println("2");
        break;
        case  3:
        out.println("3");
        break;
        case  4:
        out.println("4");
        break;
        case  5:
        out.println("5");
        break;
        case  6:
        out.println("6");
        break;
        case  7:
        out.println("7");
        break;
        }
        out.println();
        out.flush();
        }
        }


