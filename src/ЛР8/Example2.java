package ��8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class Example2 {

        public static void main(String[] args) {
            String inputFileName = "c:\\users\\����\\input.txt";
            String outputFileName = "c:\\users\\����\\output.txt";

            try {
                // ������ ������� ����
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                FileWriter writer = new FileWriter(outputFileName);

                String line;
                int lineNumber = 0;

                // ��������� ������ �������� ����
                while((line = reader.readLine()) != null) {
                    lineNumber++;
                    String[] words = line.split(" ");
                    int consonantWordsCount = 0;

                    // ���������� ����� � ������
                    for(String word : words) {
                        // ���������, ���������� �� ����� � ��������� �����
                        if (word.matches("\\b[a����������]\\w*")) {
                            consonantWordsCount++;
                            // ���������� � ����� ���� ����� ������ � ��������� �����
                            writer.write("������: " + lineNumber + ", �����: " + word + "\n");
                        }
                    }

                    // ���������� ���������� ��������� ���� � ������
                    writer.write("���������� ���� �� ��������� �����: " + consonantWordsCount + "\n");
                }

                reader.close();
                writer.close();
                System.out.println("��������� ������� ���������!");
            } catch (IOException ex) {
                System.out.println("������ ��� ������ � �������: " + ex.getMessage());
            }
        }
    }
