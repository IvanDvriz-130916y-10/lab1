package ��10.Example2_3;

// ����������� ����������� ������
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
public class Example3 {
    public static void main(String[] args) {
        JSONArray books = new JSONArray();

        // ������� ����� �����
        JSONObject newBook = new JSONObject();
        newBook.put("title", "���� ��������");
        JSONObject author = new JSONObject();
        author.put("autor", "��� ���������� �������");
        newBook.put("years", 1873);

        // ��������� ����� ����� � ������
        books.add(newBook);

        try (FileWriter file = new FileWriter("src/��10/Example1/JSON/example3.json")) {
            file.write(books.toString());
            System.out.println("����� ����� ��������� � ���� JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}