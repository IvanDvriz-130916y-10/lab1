package ЛР9.Number6ЛР9.СравнениеВремениПоИндексу;

import java.util.HashSet;
import java.util.Random;

public class HashSetTime {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();

        // Заполняем HashSet случайными числами
        for (int i = 0; i < 1000000; i++) {
            set.add(random.nextInt(1000000));
        }

        long startTime = System.nanoTime();

        // Получаем элемент по индексу
        int index = random.nextInt(1000000);
        boolean contains = set.contains(index);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Выводим время выполнения операции

        System.out.println("Время затраченное на получение элемента по индексу из HashSet: " + duration + " наносекунд");
    }
}
