package ��7.Example5;

    public class Main {
        public static void main(String[] args) {
            // �������� ������� SubClass1
            SubClass1 object1 = new SubClass1("��������� ����", 123);
            // ����� ������ display ��� ������� SubClass1
            object1.display();

            // �������� ������� SubClass2
            SubClass2 object2 = new SubClass2("������ �����", 'A');
            // ����� ������ display ��� ������� SubClass2
            object2.display();

            // ��������� ���������� �����������, ������� ��������� �� ������ ������������ ������
            SuperClass object3 = new SubClass1("������������", 456);
            // ����� ������ display ����� ��������� ���������� �����������
            object3.display();
        }
    }

