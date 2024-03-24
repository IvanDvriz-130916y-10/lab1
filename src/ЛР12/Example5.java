package ��12;

//        �������� �������, ������� ������� ������������ ������� � ������� ����� ����� ��� ������ ���������������.
//        ���������� ������� ������ ���� ����� ���������� ���� ����������.

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example5 {

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

        // ��������� ������ ��� ������ ������������ �������� � ������ ����� �������
        for (int i = 0; i < numCores; i++) {
            int finalI = i;
            results[i] = executorService.submit(() -> findMax(chunks[finalI]));
        }

        // ������� ���������� ���� ������� � �������� ����������
        int max = Integer.MIN_VALUE;
        for (Future<Integer> result : results) {
            try {
                int localMax = result.get();
                if (localMax > max) {
                    max = localMax;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // ������� ������������ ��������
        System.out.println("������������ ��������: " + max);

        // ��������� ��� �������
        executorService.shutdown();
    }

    private static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}


//    �������������� ������ �����: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//        ���������� ���� ����������: 4
//        ���������� ������� �� ����� �� ���������� ���� ����������:
//        ����� 1: {1, 2}
//        ����� 2: {3, 4}
//        ����� 3: {5, 6}
//        ����� 4: {7, 8}
//        ����� 5: {9, 10} (��������� �����, ����� ������ ���������)
//        �������� ���� ������� � ������ ������� ��� ������ ������������ �������� � ������ ����� �������.
//        ����� 1: ������������ �������� � ����� 1: 2
//        ����� 2: ������������ �������� � ����� 2: 4
//        ����� 3: ������������ �������� � ����� 3: 6
//        ����� 4: ������������ �������� � ����� 4: 8
//        ����� 5: ������������ �������� � ����� 5: 10
//        ����� ��������� ������������ �������� � ������ ����� �������:
//        2, 4, 6, 8, 10
//        ������������ �������� �� ���������: 8
//        ����, ��������� �� ����� 8, ��� ��� ������ ��� �������� �� �����, � ������ ����� ���� ���������� ��������� �������.
//        ��������� ������������ �������� � ������ ����� ���� �������� � ������� ���������� �� ��� (������� ����� 8,
//        ��� ��� 10 ���� � ��������� �����, ������������ �������, �� ���������� �� ��������� ���������� ���� 8).


