package ��9.Number6��9.��������������������������;


import java.util.HashSet;

public class AddingToTheBeginningHashSet {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        long startTime = System.nanoTime();
        hashSet.add(1);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("����� ����������� �� ���������� ��������� � ������ HashMap: " + duration + " �����������"); // ������� ����� ��������
    }
}


