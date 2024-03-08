package ��9.Example2;

 // ������� ���������� � �������������� �������� ��� �������� ������ �����, ���������� � ����������, � �������� ������� ���������.

import java.util.Scanner;
public class Example2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("������� ����� ����� ��� �������� � �������� �������: ");
            int number = scanner.nextInt();

            String binary = convertToBinary(number);
            System.out.println("����� " + number + " � �������� �������: " + binary);
        }

        public static String convertToBinary(int number) {
            // ������� ������: ���� ����� ����� 0, ���������� "0"
            if (number == 0) {
                return "0";
            }

            // ����������� ������: ����� ����� �� 2 � ���������� �������� ������� � �������� �� �������
            int quotient = number / 2;
            int remainder = number % 2;
            return convertToBinary(quotient) + remainder;
        }
    }

