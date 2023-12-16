package ЛР4;

import java.util.Arrays;
import java.util.Random;

public class Example6_1 {
    public static void main(String[] args) {

        int[][] a = new int[3][3];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

        int z = 1;

        int[][] a2 = new int[a.length - 1][];

        System.arraycopy(a, 0, a2, 0, z);

        System.arraycopy(a, z + 1, a2, z, a.length - z - 1);

        a = a2;

        System.out.println("Удаление строки: " + Arrays.deepToString(a));
    }
}
