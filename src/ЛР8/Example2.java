package ЛР8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class Example2 {

        public static void main(String[] args) {
            String inputFileName = "c:\\users\\иван\\input.txt";
            String outputFileName = "c:\\users\\иван\\output.txt";

            try {
                // Читаем входной файл
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                FileWriter writer = new FileWriter(outputFileName);

                String line;
                int lineNumber = 0;

                // Построчно читаем исходный файл
                while((line = reader.readLine()) != null) {
                    lineNumber++;
                    String[] words = line.split(" ");
                    int consonantWordsCount = 0;

                    // Перебираем слова в строке
                    for(String word : words) {
                        // Проверяем, начинается ли слово с согласной буквы
                        if (word.matches("\\b[aбвгджзйклм]\\w*")) {
                            consonantWordsCount++;
                            // Записываем в новый файл номер строки и найденное слово
                            writer.write("Строка: " + lineNumber + ", слово: " + word + "\n");
                        }
                    }

                    // Записываем количество найденных слов в строке
                    writer.write("Количество слов на согласную букву: " + consonantWordsCount + "\n");
                }

                reader.close();
                writer.close();
                System.out.println("Программа успешно выполнена!");
            } catch (IOException ex) {
                System.out.println("Ошибка при работе с файлами: " + ex.getMessage());
            }
        }
    }
