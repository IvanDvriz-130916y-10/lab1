package ЛР12;

// Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.
public class Example4 {
    public static void main(String[] args) {
        // Создаем 10 потоков
        for (int i = 1; i <= 10; i++) {
            // Создаем новый поток, передавая в конструктор номер потока
            Thread thread = new Thread(new MyThread(i));
            // Запускаем поток
            thread.start();
        }
    }

    static class MyThread implements Runnable {
        private int number;

        // Конструктор класса MyThread
        public MyThread(int number) {
            this.number = number;
        }

        // Метод run, который будет выполнен при запуске потока
        @Override
        // Выводим номер потока на экран
        public void run() {
            System.out.println("Thread number: " + number);
        }
    }
}

