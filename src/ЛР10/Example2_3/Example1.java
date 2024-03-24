package ЛР10.Example2_3;

//Сделайте в текстовом редакторе свой файл в формате JSON в зависимости от варианта (Приложение 1).
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Example1 {
    public static void main(String[] args) {

        JSONObject playlist = new JSONObject();
        JSONArray songs = new JSONArray();

        JSONObject song1 = new JSONObject();
        song1.put("title", "Beautiful Things");
        song1.put("author", "Benson Boone");
        song1.put("year", 2024);

        JSONObject song2 = new JSONObject();
        song2.put("title", "Going to his death");
        song2.put("author", "Ramil'");
        song2.put("year", 2023);

        songs.add(song1);
        songs.add(song2);

        playlist.put("songs", songs);

        try (FileWriter file = new FileWriter("src/ЛР10/Example2_3/example1.json")) {
            file.write(playlist.toJSONString());
            System.out.println("Json файл успешно создан");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
