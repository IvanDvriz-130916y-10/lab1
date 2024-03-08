package ЛР9.Примеры;

//      Вывести последовательность, в обратно порядке. Представленную в Recursion.

public class Recursion2 {
    public static void m(int x) {
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
        System.out.println("x = " + x);
    }
    public static void main(String[] args) {
        m(1);
    }
}

