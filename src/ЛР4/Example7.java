package ��4;

public class Example7 {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];                 // ��������� ���������� �������� ������

        int a = 0;
        int b = 0;
        int c = 1;
        int d = 0;
        int e = 0;
        int f = n;

        for (int i = 0; i < n * n; i++) {
            matrix[a][b] = i + 1;                              // ����������� ������ ������ ����� �������.

            if (--f == 0) {
                f = n * (e % 2) +
                        n * ((e + 1) % 2) -
                        (e / 2 - 1) - 2;

                int temp = c;
                c = -d;
                d = temp;
                e ++;

            }
            b += c;
            a += d;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}
