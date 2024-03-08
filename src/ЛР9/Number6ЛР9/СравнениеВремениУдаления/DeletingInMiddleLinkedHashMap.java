package ЛР9.Number6ЛР9.СравнениеВремениУдаления;

import java.util.LinkedHashMap;

public class DeletingInMiddleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 500000; i++) {
            linkedHashMap.put(i, "Element" + i);
        }

        long startTime = System.nanoTime();
        linkedHashMap.remove(250000);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время выполнения операции удаления элемента в середине из LinkedHashMap: " + duration + " наносекунд");
    }
}

