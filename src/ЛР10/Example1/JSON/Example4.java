package ��10.Example1.JSON;

//  ��� ��������� ���� JSON

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/��10/Example1/JSON/example3.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("�������� �������: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);
            System.out.print("������� ������ ��� ������: ");
            String searchAuthor = scanner.nextLine();

            boolean found = false;
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                String author = (String) book.get("autor");
                if (author.equalsIgnoreCase(searchAuthor)) {
                    found = true;
                    System.out.println("\n ������� �������: book");
                    System.out.println("�������� �����: " + book.get("title"));
                    System.out.println("�����: " + author);
                    System.out.println("��� �������: " + book.get("year"));
                }
            }

            if (!found) {
                System.out.println("����� ������ " + searchAuthor + " �� �������.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}