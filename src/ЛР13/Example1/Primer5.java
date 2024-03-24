package ЛР13.Example1;

public class Primer5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (RuntimeException e) {
            System.out.println("1"); // Блок catch для исключения типа RuntimeException
        }
        System.out.println("2");
    }
}