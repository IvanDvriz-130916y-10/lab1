package ЛР8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example1_2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // Читаем 1 байт
            if (oneByte != -1) {    // Признак отсутствия конца файла
                System.out.println((char) oneByte);
            } else {
                System.out.println("\n" + " end ");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {

            // С потоком связан файл
            InputStream inFile = new FileInputStream("c:/MyFile1.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            // С потоком связана интернет-страница5
            InputStream inUrl = new URL("www.yandex.ru").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            // С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println(" Ошибка: " + e);
        }
    }
}
