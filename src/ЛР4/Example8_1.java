package ЛР4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите текст для шифрования: ");
            String text = scanner.nextLine();

            System.out.print("Введите ключ: ");
            int shift = scanner.nextInt();
            String encryptStr = Caeser.encrypt(text, shift);

            System.out.print("Текст после преобразования: " + "\"" + encryptStr + "\"");

            System.out.print("\nВыполнить обратное преобразование? (y/n)");
            boolean cool = false;
            while (!cool) {
                String reply = scanner.next();

                if (reply.toLowerCase().equals("y")) {
                    String decryptStr = Caeser.decrypt(encryptStr, shift);
                    System.out.println(decryptStr);
                    cool = true;
                }

                else if (reply.toLowerCase().equals("n")) {
                    System.out.println("До свидания!");
                    cool = true;
                }

                else {
                    System.out.println("Введите корректный ответ: ");
                    cool = false;
                }
            }
        }
        private static class Caeser {
            static String encryptText;
            private static String encrypt(String enText, int key)
            {
                char[] ArrayText = enText.toCharArray();
                int[] CharCode = new int[ArrayText.length];
                System.out.println("chars до преобразования: " + Arrays.toString(CharCode));
                for (int i = 0; i < ArrayText.length; i++)
                {
                    CharCode[i] = ArrayText[i];
                    CharCode[i] = CharCode[i] + key;
                }
                System.out.println("innt после преобразования: " + Arrays.toString(ArrayText));
                for (int i = 0; i < ArrayText.length; i++)
                {
                    ArrayText[i] = (char) CharCode[i];
                }
                System.out.println("chars после преобразования: " + Arrays.toString(CharCode));
                encryptText = new String(ArrayText);
                return encryptText;
            }

            private static String decrypt(String enText, int key)
            {
                char[] ArrayText = enText.toCharArray();
                int[] CharCode = new int[ArrayText.length];
                for (int i = 0; i < ArrayText.length; i++)
                {
                    CharCode[i] = ArrayText[i];
                    CharCode[i] = CharCode[i] - key;
                }
                for (int i = 0; i < ArrayText.length; i++)
                {
                    ArrayText[i] = (char) CharCode[i];
                }
                encryptText = new String(ArrayText);
                return encryptText;
            }
        }
    }

