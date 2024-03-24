package Ћ–12;

// Ќапишите программу, котора€ запускает два потока и выводит на экран их имена и текущее врем€ в течение 10 секунд.

import java.time.LocalTime;
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        // —оздаем два потока t1
        Thread t1 = new Thread(() -> {
            // ¬ каждом потоке выполн€ем цикл, который выводит текущее врем€ и им€ потока 10 раз
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
            // —оздаем два потока t2
        Thread t2 = new Thread(() -> {
            // ¬ каждом потоке выполн€ем цикл, который выводит текущее врем€ и им€ потока 10 раз
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
// «апускаем потоки t1 и t2
        t1.start();
        t2.start();
// ќжидаем завершение выполнени€ потоков t1 и t2, чтобы основной поток (main) продолжил выполнение
        t1.join();
        t2.join();
    }
}
