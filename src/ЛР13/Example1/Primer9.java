package ЛР13.Example1;

public class Primer9 {
    public static class Main {
        public int m() {
            try {
                System.out.println("0");
                return 55;    // выход из метода
            } finally {
                System.out.println("1");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.m());
    }
}