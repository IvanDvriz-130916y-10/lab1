package ��7.Example4;

public class Main {
    public static void main(String[] args) {
        // �������� ������� FinalClass � �����������
        FinalClass obj1 = new FinalClass('N', "Text", 789);

        // �������� ����� ������� FinalClass
        FinalClass obj2 = new FinalClass(obj1);

        // ����� �������� ����� ��� ������� obj1
        System.out.println("�������� ���� symbol: " + obj1.symbol);
        System.out.println("�������� ���� text: " + obj1.text);
        System.out.println("�������� ���� number: " + obj1.number);

        // ����� �������� ����� ��� ������� obj2 (�����)
        System.out.println("�������� ���� symbol (�����): " + obj2.symbol);
        System.out.println("�������� ���� text (�����): " + obj2.text);
        System.out.println("�������� ���� number (�����): " + obj2.number);
    }
}