package ЛР13.Example2;

    import java.util.Scanner;

    public class Example3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size;
            byte sum = 0;

            System.out.print("Введите размер массива: ");
            size = scanner.nextInt();

            byte[] array = new byte[size];

            for (int i = 0; i < size; i++) {
                try {
                    System.out.print("Введите элемент массива: ");
                    array[i] = Byte.parseByte(scanner.next());

                    sum += array[i];
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите число!");
                    i--; // Повторяем ввод для этого элемента
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка: введено значение за пределами диапазона типа byte!");
                    i--; // Повторяем ввод для этого элемента
                }
            }

            System.out.println("Сумма элементов массива: " + sum);
        }
    }
