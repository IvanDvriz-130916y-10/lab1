package ЛР13.Example1;

public class Primer10 {
    public class Main {
        public int m() {
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                // return 20; // лучше не возвращать значение из блока finally
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Primer10().new Main(); // создаем экземпляр вложенного класса Main
        System.out.println(main.m());
    }
}
