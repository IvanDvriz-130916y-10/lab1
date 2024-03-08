package ЛР9.Number6ЛР9.СравнениеВремениУдаления;

import java.util.ArrayList;

public class DeletingInMiddleArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

// Заполнение списка элементами
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        arrayList.remove(arrayList.size() / 2); // Добавление.New.Удаление элемента
        long endTime = System.nanoTime();

        System.out.println("Время выполнения операции удаления элемента в середине из arrayList: " + (endTime - startTime) + " наносекунд");

    }
}
