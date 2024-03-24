package ��12;

    //        �������� ���������, ������� ������� ��� ������, ������� ������� �� ����� ����� �� 1 �� 10.
    //        ������ ����� ������ �������� ������ ������ �����, � ������ ����� ������ �������� ������ �������� �����.

import org.apache.poi.ss.formula.functions.T;

public class Example3 {
    private static final Object lock = new Object();

    private static int number = 1;

    public static void main(String[] args) {
        // �������� ������� ������
        Thread evenThread = new Thread(() -> {
            // ������������� �� ������� lock
           synchronized (lock) {
               // ���� ����������, ���� ����� ������ 10
               while (number < 10) {
                   // �������� �� �������� �����, ����� ������� ����� � ���������� ����� �� 1
                   if (number % 2 == 0) {
                       System.out.println(Thread.currentThread().getName() + ": " + number);
                       number++;
                   } else {
                       try {
                           lock.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   lock.notifyAll();
               }
           }
        });
        // �������� ��������� ������
        Thread oddThread = new Thread(() -> {
            // ������������� �� ������� lock
            synchronized (lock) {
                // ���� ����������, ���� ����� ������ 10
                while (number < 10) {
                    // �������� �� ���������� �����, ����� ������� ����� � ���������� ����� �� 1
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    }
                    // � ��������� ������ ����� ���� ����������� � ����������� ����������
                    else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        // ��������� ����� ��� ������� � ��������� ������
        evenThread.setName("Even Thread");
        oddThread.setName("Odd Thread");
        // ������ ������� ����������
        evenThread.start();
        oddThread.start();
    }
}
