package ��3;
;
import java.util.Scanner;
public class Example7 {
        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);
            char [] cool = new char[]{'�','�','�','�','�','�','�','�','�','�'};
            for (int i =0; i < 10; i++) {
                System.out.println("� ������� ����: " + cool[i]);
            }

            for (int x= cool.length - 1; x>=0;x--){
                System.out.println("� �������� ����: " + cool[x]);
            }
        }
    }

