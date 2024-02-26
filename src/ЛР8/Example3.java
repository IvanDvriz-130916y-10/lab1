package ЛР8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
public class Example3 {
        public static void main(String[] args) {
            String inputFile = "c:\\users\\иван\\input.txt";
            String outputFile = "c:\\users\\иван\\output.txt";
            HashSet<Character> consonants = new HashSet<>(); // Множество согласных букв
            consonants.add('а');
            consonants.add('б');
            consonants.add('в');
            consonants.add('г');
            consonants.add('д');
            consonants.add('е');
            // Добавьте оставшиеся согласные буквы в это множество

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+"); // Разделение строки на слова
                    int selectedWordsCount = 0;

                    for (String word : words) {
                        if (!word.isEmpty() && consonants.contains(Character.toLowerCase(word.charAt(0)))) {
                            writer.write("Строка " + lineNumber + ": " + word);
                            writer.newLine();
                            selectedWordsCount++;
                        }
                    }

                    writer.write("Строка " + lineNumber + ": выбрано слов - " + selectedWordsCount);
                    writer.newLine();
                    lineNumber++;
                }
            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла: " + e.getMessage());
            }
        }
    }
