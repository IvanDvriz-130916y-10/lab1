package ��3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.println("�������� ���� ������!");
        String Day = scanner.nextLine();
        String monday = "�����������";
        String tuesday = "�������";
        String wednesday = "�����";
        String thursday = "�������";
        String friday = "�������";
        String saturday = "�������";
        String sunday = "�����������";
            switch (Day) {
                case "�����������":
                    out.println("1");
                    break;
                case "�������":
                    out.println("2");
                    break;
                case "�����":
                    out.println("3");
                    break;
                case "�������":
                    out.println("4");
                    break;
                case "�������":
                    out.println("5");
                    break;
                case "�������":
                    out.println("6");
                    break;
                case "�����������":
                    out.println("7");
                    break;
                default:
                    System.out.println("������ ��� ���");
            }
        out.println();
            out.flush();
        }
    }



