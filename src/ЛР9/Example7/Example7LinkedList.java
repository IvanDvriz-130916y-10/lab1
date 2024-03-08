package ��9.Example7;

import java.util.LinkedList;
public class Example7LinkedList {
    public static void main(String[] args) {
        int N = 10; // ���������� �������

        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size(); // ������� ���������� �������� ��� ��������
            people.remove(index); // ������� ������� ��������
        }

        System.out.println("���������� �������: " + people.get(0));
    }
}
