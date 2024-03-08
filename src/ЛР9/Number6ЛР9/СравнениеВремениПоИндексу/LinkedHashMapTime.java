package ЛР9.Number6ЛР9.СравнениеВремениПоИндексу;

import java.util.LinkedHashMap;
import java.util.Random;

public class LinkedHashMapTime {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Random random = new Random();

        // Заполняем LinkedHashMap случайными числами
        for (int i = 0; i < 1000000; i++) {
            map.put(i, random.nextInt(1000000));
        }

        long startTime = System.nanoTime();

        // Получаем элемент по индексу
        int index = random.nextInt(1000000);
        int value = map.get(index);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Выводим время выполнения операции
        System.out.println("Время затраченное на получение элемента по индексу из LinkedHashMap: " + duration + " наносекунд");
    }
}


