package ��13.Example1;

public class Primer8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) { // ��������� ��������� ���������� RuntimeException
            System.out.println("��������� ����������");
        } finally {
            System.out.println("1");
        }
        return 0; // ��������� ������������ ��������, ����� ����� ���� ��� int
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
