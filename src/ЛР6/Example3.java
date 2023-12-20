package ЛР6;

import static java.lang.System.out;
public class Example3 {
    public static void main(String[] args) {
            int max, min;
            double avg;
            int[] a = {1, 3, 5, 7, 9, 11};
            int sum = 0;
            max = a[0];
            min = a[0];
            for (int q = 0; q < a.length; q++) {
                sum += a[q];
                if (a[q] > max) max = a[q];
                if (a[q] < min) min = a[q];
            }
            avg = (double) sum / a.length;

        out.println("Минимальное значение: " + min);
        out.println("Максимальное значение: " + max);
        out.println("Среднее значение: " + avg);

    }
}

