package ��10.Example2_3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Example4 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/��10/Example1/JSON/example3.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("�������� �������: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\n������� �������: book");
                System.out.println("�������� �����: " + book.get("title"));
                System.out.println("�����: " + book.get("autor"));
                System.out.println("��� �������: " + book.get("year"));
            }

            deleteBookByTitle(jsonArray, "�������� ����� ��� ��������");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteBookByTitle(JSONArray jsonArray, String title) {
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject book = (JSONObject) jsonArray.get(i);
            if (book.get("title").equals(title)) {
                jsonArray.remove(i);
                System.out.println("����� � ��������� '" + title + "' ���� �������.");
                return;
            }
        }
        System.out.println("����� � ��������� '" + title + "' �� ���� �������.");
    }
}