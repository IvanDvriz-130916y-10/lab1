package ��12;

// �������� ���������, ������� ������� 10 ������� � ������ ����� ������� �� ����� ���� �����.
public class Example4 {
    public static void main(String[] args) {
        // ������� 10 �������
        for (int i = 1; i <= 10; i++) {
            // ������� ����� �����, ��������� � ����������� ����� ������
            Thread thread = new Thread(new MyThread(i));
            // ��������� �����
            thread.start();
        }
    }

    static class MyThread implements Runnable {
        private int number;

        // ����������� ������ MyThread
        public MyThread(int number) {
            this.number = number;
        }

        // ����� run, ������� ����� �������� ��� ������� ������
        @Override
        // ������� ����� ������ �� �����
        public void run() {
            System.out.println("Thread number: " + number);
        }
    }
}

