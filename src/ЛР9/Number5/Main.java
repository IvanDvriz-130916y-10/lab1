package ��9.Number5;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("���-����� ��������� ���������: " + duration);

        startTime = System.nanoTime();
        hashSet.remove(50000);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("���-����� ��������� ���������: " + duration);

        startTime = System.nanoTime();
        hashSet.contains(99999);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("���-����� �������� ���������: " + duration);


        // LinkedHashMap
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedHashMap.put(i, i);
        }

        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedHashMap ��������� ���������: " + duration);

        startTime = System.nanoTime();
        linkedHashMap.remove(50000);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedHashMap ��������� ���������: " + duration);

        startTime = System.nanoTime();
        linkedHashMap.get(99999);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedHashMap �������� ���������: " + duration);


        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList add complexity: " + duration);

        startTime = System.nanoTime();
        arrayList.remove(50000);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList ��������� ���������: " + duration);

        startTime = System.nanoTime();
        arrayList.get(99998); // Corrected the index to be within bounds
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("ArrayList �������� ���������: " + duration);
    }
}