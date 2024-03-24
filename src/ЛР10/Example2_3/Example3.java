package ЛР10.Example2_3;

// Импортируем необходимые классы
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
public class Example3 {
    public static void main(String[] args) {
        JSONArray books = new JSONArray();

        // Создаем новую книгу
        JSONObject newBook = new JSONObject();
        newBook.put("title", "Анна Каренина");
        JSONObject author = new JSONObject();
        author.put("autor", "Льв Николаевич Толстой");
        newBook.put("years", 1873);

        // Добавляем новую книгу в массив
        books.add(newBook);

        try (FileWriter file = new FileWriter("src/ЛР10/Example1/JSON/example3.json")) {
            file.write(books.toString());
            System.out.println("Новая книга добавлена в файл JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}