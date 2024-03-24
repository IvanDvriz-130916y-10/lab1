package ��12;

 // �������� ���������, ������� ��������� ����� � ������� �� ����� ����� �� 1 �� 10 � ��������� � 1 ������� ����� ��������.

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        // �������� ������ ������
            Thread t = new Thread(() -> {
                for (int i = 1; i <= 10; i++) {
                    // ����� ����� i � �������
                    System.out.println(i);
                    try {
                        // ������������ ������ �� 1 �������
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        // ������ ������
            t.start();
        // �������� ���������� ������ t
            t.join();
    }
}
