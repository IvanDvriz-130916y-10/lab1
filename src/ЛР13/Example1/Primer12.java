package ��13.Example1;

public class Primer12 {
    public static class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("������ ������� �������");
            }
            if (chislo >= 0.001) { // ������� �������� �� >=, ����� ��������� ������
                throw new IllegalArgumentException("�������� �����");
            } else {
                System.out.println("��� �������� ���������");
            }
        }

        public static void main(String[] args) {
            m("������", 0.000001); // � main �������� ���������� ���������
        }
    }
}
