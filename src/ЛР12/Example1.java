package ��12;

// �������� ���������, ������� ��������� ��� ������ � ������� �� ����� �� ����� � ������� ����� � ������� 10 ������.

import java.time.LocalTime;
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        // ������� ��� ������ t1
        Thread t1 = new Thread(() -> {
            // � ������ ������ ��������� ����, ������� ������� ������� ����� � ��� ������ 10 ���
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
            // ������� ��� ������ t2
        Thread t2 = new Thread(() -> {
            // � ������ ������ ��������� ����, ������� ������� ������� ����� � ��� ������ 10 ���
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
// ��������� ������ t1 � t2
        t1.start();
        t2.start();
// ������� ���������� ���������� ������� t1 � t2, ����� �������� ����� (main) ��������� ����������
        t1.join();
        t2.join();
    }
}
