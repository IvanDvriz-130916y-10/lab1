package ЛР9.Number6ЛР9.СравнениеВремениУдаления;

import java.util.HashSet;

public class DeletingInEndHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 500000; i++) {
            hashSet.add("Element" + i);
        }

        long startTime = System.nanoTime();
        hashSet.remove("Element499999");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Время выполнения операции удаления элемента в конецe HashSet: " + duration + " наносекунд");
    }
}

