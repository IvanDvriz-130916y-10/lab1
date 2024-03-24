package ЛР12;

 // Напишите программу, которая запускает поток и выводит на экран числа от 1 до 10 с задержкой в 1 секунду между выводами.

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        // Создание нового потока
            Thread t = new Thread(() -> {
                for (int i = 1; i <= 10; i++) {
                    // Вывод числа i в консоль
                    System.out.println(i);
                    try {
                        // Приостановка потока на 1 секунду
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        // Запуск потока
            t.start();
        // Ожидание завершения потока t
            t.join();
    }
}
