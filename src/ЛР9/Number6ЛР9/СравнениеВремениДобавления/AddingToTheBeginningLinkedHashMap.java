package ��9.Number6��9.��������������������������;

import java.util.LinkedHashMap;

public class AddingToTheBeginningLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        long startTime = System.nanoTime();
        linkedHashMap.put(1, "One");
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("����� ����������� �� ���������� �������� � ������ LinkedHashMap: " + duration + " ����������");
    }
}

