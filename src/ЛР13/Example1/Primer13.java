package ЛР13.Example1;

public class Primer13 {
    public static class Main { // Исправляем Main на static
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива = " + l);

                if (l != 0) {
                    int h = 10 / l; // Изменяем на целочисленное деление
                    args[l - 1] = "10"; // Изменяем индекс на l - 1
                }
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс не существует");
            }
        }
    }
}
