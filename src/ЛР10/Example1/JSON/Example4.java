package ЛР10.Example1.JSON;

//  Как прочитать файл JSON

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/ЛР10/Example1/JSON/example3.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите автора для поиска: ");
            String searchAuthor = scanner.nextLine();

            boolean found = false;
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                String author = (String) book.get("autor");
                if (author.equalsIgnoreCase(searchAuthor)) {
                    found = true;
                    System.out.println("\n Текущий элемент: book");
                    System.out.println("Название книги: " + book.get("title"));
                    System.out.println("Автор: " + author);
                    System.out.println("Год издания: " + book.get("year"));
                }
            }

            if (!found) {
                System.out.println("Книги автора " + searchAuthor + " не найдено.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}