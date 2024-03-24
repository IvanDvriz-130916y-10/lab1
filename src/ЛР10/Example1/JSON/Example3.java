package ��10.Example1.JSON;

// ��� ������� ���� JSON

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Example3 {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "����� � ���");
        book1.put("autor", "��� �������");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("title", "������ � ���������");
        book2.put("autor", "������ ��������");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try {
            FileWriter file = new FileWriter("src/��10/Example1/JSON/example3.json");
            file.write(library.toJSONString());
            System.out.println("JSON ���� ������� ������! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
