package ЛР8;

import java.io.*;

public class Example1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            // Создание файловых символьных птотоков для чтения и записи
            br = new BufferedReader(new FileReader("C:\\MyFile1.txt"), 1024);       // 1024 Размер буфера
            out = new BufferedWriter(new FileWriter("C:\\MyFile2.txt"));
            int lineCode = 0; // счетчик строк
            String s;
            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCode++;
                System.out.println(lineCode + " : " + s);
                out.write(s);
                out.newLine();      // Переход на новую строку
            }
        } catch (IOException e) {
            System.out.println(" Ошибка !!!!!!!! ");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
