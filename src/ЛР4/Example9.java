package ��4;

import java.util.Arrays;
import java.util.Scanner;

public class Example9  {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� �����, ������� �� ������ �����������: ");
            String message = scanner.nextLine();
            System.out.println("������� ����: ");
            int key = scanner.nextInt();
            key = Math.abs(key)%26;

            Example9 cezar = new Example9();
            String msg1 = cezar.code(message, key);
            System.out.println("�� �����: " + message + "\n" + "Encoder " + msg1);

            System.out.print("\n��������� �������� ��������������? (y/n)");
            boolean cool = false;
            while (!cool) {
                String reply = scanner.next();

                if (reply.toLowerCase().equals("y")) {
                    String msg2 = cezar.deCode(msg1, key);
                    System.out.println("�����������: " + msg1 + "\n" + "Decoder " + msg2);
                    cool = true;
                }

                else if (reply.toLowerCase().equals("n")) {
                    System.out.println("�� ��������!");
                    cool = true;
                }

                else {
                    System.out.println("������� ���������� �����: ");
                    cool = false;
                }
            }
        }
        public String code(String s, int key) {

            String str="";

            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if( c>=65 && c<=90) {
                    str += codeChar(c, key, 65);
                } else {
                    if( c>=97 && c<=122) {
                        str += codeChar(c, key, 97);
                    } else {
                        str += c;
                    }
                }
            }
            return str;
        }
        private char codeChar(char c, int key, int shift) {
            int a = (int)c+key;
            if(a >= shift+26)
                a -= 26;
            return (char) a;
        }
        public String deCode(String s, int key) {
            return code(s, 26-key);
        }
        public static void codeCase() {
            System.out.println((int)'A');
            System.out.println((int)'Z');
            System.out.println("---------------");
            System.out.println((int)'a');
            System.out.println((int)'z');
            System.out.println("---------------");
        }

    }


