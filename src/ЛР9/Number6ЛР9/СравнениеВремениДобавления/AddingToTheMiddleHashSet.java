package ЛР9.Number6ЛР9.СравнениеВремениДобавления;

import java.util.HashMap;

public class AddingToTheMiddleHashSet {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); // Засекаем начальное время

        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < 50000; i++) {
            hashMap.put(i, "Value" + i);
        }

        for (int i = 50000; i < 150000; i++) {
            hashMap.put(i, "Value" + i);
        }

        long endTime = System.nanoTime(); // Засекаем конечное время
        long duration = endTime - startTime; // Вычисляем время выполнения операции в наносекундах

        System.out.println("Время затраченное на добавление элементов в середину HashMap: " + duration + " наносекунд");
    }
}
