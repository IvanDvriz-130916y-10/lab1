package ��8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
public class Example3 {
        public static void main(String[] args) {
            String inputFile = "c:\\users\\����\\input.txt";
            String outputFile = "c:\\users\\����\\output.txt";
            HashSet<Character> consonants = new HashSet<>(); // ��������� ��������� ����
            consonants.add('�');
            consonants.add('�');
            consonants.add('�');
            consonants.add('�');
            consonants.add('�');
            consonants.add('�');
            // �������� ���������� ��������� ����� � ��� ���������

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+"); // ���������� ������ �� �����
                    int selectedWordsCount = 0;

                    for (String word : words) {
                        if (!word.isEmpty() && consonants.contains(Character.toLowerCase(word.charAt(0)))) {
                            writer.write("������ " + lineNumber + ": " + word);
                            writer.newLine();
                            selectedWordsCount++;
                        }
                    }

                    writer.write("������ " + lineNumber + ": ������� ���� - " + selectedWordsCount);
                    writer.newLine();
                    lineNumber++;
                }
            } catch (IOException e) {
                System.out.println("������ ��� ������ �����: " + e.getMessage());
            }
        }
    }
