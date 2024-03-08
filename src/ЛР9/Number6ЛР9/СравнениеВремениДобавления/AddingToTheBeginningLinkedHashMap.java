package ЛР9.Number6ЛР9.СравнениеВремениДобавления;

import java.util.LinkedHashMap;

public class AddingToTheBeginningLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        long startTime = System.nanoTime();
        linkedHashMap.put(1, "One");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время затраченное на добавление элемента в начало LinkedHashMap: " + duration + " наносекунд");
    }
}

