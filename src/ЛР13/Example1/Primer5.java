package ��13.Example1;

public class Primer5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("������");
        } catch (RuntimeException e) {
            System.out.println("1"); // ���� catch ��� ���������� ���� RuntimeException
        }
        System.out.println("2");
    }
}