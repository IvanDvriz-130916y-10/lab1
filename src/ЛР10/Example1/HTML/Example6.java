package ЛР10.Example1.HTML;

// Код программы, который парсит страницу http://fat.urfu.ru/index.html и выводит в консоль темы новостей и даты их публикации

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import javax.swing.text.html.parser.Parser;
import java.io.IOException;
import java.util.List;
public class Example6 {
    public static void main(String[] args) {
        try {
            // Получаем HTML-код страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Извлекаем список новостей
            Elements newsParser = doc
                    .select("body > table > tbody > tr > td > div > table > "
                    + "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > "
                    + "tr > td:nth-child(1)");

            // Выводим последние 10 новостей в консоль
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParser.get(0).childNodes();
                    System.out.println("Тема: " +
                            ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0));
                    System.out.println("Дата: " +
                            ((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0) +
                            "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

