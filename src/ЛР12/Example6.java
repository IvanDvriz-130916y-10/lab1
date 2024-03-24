package ��12;

//        �������� �������, ������� ��������� �������� � ������� ����� ����� ��� ������ ���������������.
//        ���������� ������� ������ ���� ����� ���������� ���� ����������

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example6 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // �������� ���������� ���� ����������
        int numCores = Runtime.getRuntime().availableProcessors();

        // ������� ��� ������� � ����������� �������, ������ ���������� ���� ����������
        ExecutorService executorService = Executors.newFixedThreadPool(numCores);

        // ��������� ������ �� ����� �� ���������� ���� ����������
        int chunkSize = numbers.length / numCores;
        int[][] chunks = new int[numCores][];
        for (int i = 0; i < numCores; i++) {
            chunks[i] = Arrays.copyOfRange(numbers, i * chunkSize, (i + 1) * chunkSize);
        }

        // ������� ������ ��� �������� ����������� ���������� �������
        Future<Integer>[] results = new Future[numCores];

        // ��������� ������ ��� ������������ ��������� � ������ ����� �������
        for (int i = 0; i < numCores; i++) {
            int finalI = i;
            results[i] = executorService.submit(() -> sum(chunks[finalI]));
        }

        // ������� ���������� ���� ������� � �������� ����������
        int sum = 0;
        for (Future<Integer> result : results) {
            try {
                sum += result.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // ������� ����� ��������� �������
        System.out.println("����� ��������� �������: " + sum);

        // ��������� ��� �������
        executorService.shutdown();
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
