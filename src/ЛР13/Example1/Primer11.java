package ��13.Example1;

public class Primer11 {
    public static void m(String str, double chislo) {
        if (chislo > 0.001) {
            throw new IllegalArgumentException("�������� �����");
        }
        if (str == null) {
            throw new IllegalArgumentException("������ ������� �������");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
