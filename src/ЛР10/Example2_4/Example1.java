package ��10.Example2_4;

//�������� ���������� ������ ���������� ������ � ���� ��� ����������
//        ���������� �� �������.

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        String url= "https://itlearn.ru/first-step";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");

            // ������� ����� ���� ��� ������ ������
            File file = new File("src/��10/Example2_4/links.txt");
            FileWriter writer = new FileWriter(file);

            for (Element link : links) {
                // ������� ������ � �������
                System.out.println(link.attr("abs:href"));

                // ���������� ������ � ����
                writer.write(link.attr("abs:href") + "\n");
            }

            writer.close(); // ��������� FileWriter

            System.out.println("������ ������� �������� � ���� links.txt");
        } catch (IOException e) {
            // ������� ��������� �� ������
            e.printStackTrace();
        }
    }
}