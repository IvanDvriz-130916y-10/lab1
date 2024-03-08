package ЛР9.Number6ЛР9.СравнениеВремениДобавления;

import java.util.ArrayList;
import java.util.List;

public class AddingToTheEndArrayList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        // Измерение времени выполнения операции добавления в конце arrayList
        System.out.println("Время выполнения операции добавления в конце ArrayList: " + getRunningTime(arrayList) + " наносекунд");
    }

    private static long getRunningTime(List<Integer> list) {

        // Точка начала отсчета времени выполнения программы
        long start = System.nanoTime();

        // Блок кода, в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // Точка окончания отсчета времени выполнения программы
        long end = System.nanoTime();

        // Вывод в консоль времени выполнения блока кода, содержащего операцию
        return end - start;
    }
}
