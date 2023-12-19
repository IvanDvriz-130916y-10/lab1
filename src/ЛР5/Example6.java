package ЛР5;

public class Example6 {
    public static void main(String[] args) {
        Main6 examplee = new Main6(2, 22);
        examplee.pInt();

        examplee = new Main6(76);
        examplee.pInt();

        examplee.sInt(7, 17);
        examplee.pInt();

        examplee.sInt(-20);
        examplee.pInt();
    }
    public static class Main6 {
        private int max;
        private int min;

        public void sInt (int n, int n1) {
            System.out.println("Метод c двумя аргументами ");
            max = Math.max(n, n1);
            min = Math.min(n, n1);
        }

        public void sInt (int n) {
            System.out.println("Метод с одним аргументом ");
            max = Math.max(max, n);
            min = Math.min(min,n);
        }

        void pInt (){
            System.out.println("max = " + max);
            System.out.println("min = " + min);
        }

        Main6(int n) {
            System.out.println("Конструктор с одним аргументом: ");
            max = Math.max(max,n);
            min = Math.min(min,n);
        }
        Main6 (int n, int n1) {
            System.out.println("Конструктор с двумя аргументами");
            max = Math.max(n , n1);
            min = Math.min(n , n1);
        }
    }
}
