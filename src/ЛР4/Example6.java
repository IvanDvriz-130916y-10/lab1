package ЛР4;

   import java.util.Random;
import java.util.Scanner;

    public class Example6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество столбцов массива");
            int x = in.nextInt();
            System.out.println("Введите количество строк массива");
            int y = in.nextInt();
            int[][] mass1 = new int[x][y];
            Random random = new Random();
            for (int i = 0; i < x; i++) {
                System.out.print("Номер строки: " + i + " | ");
                for (int j = 0; j < y; j++) {
                    mass1[i][j] = random.nextInt(10);
                    System.out.print(mass1[i][j] + " ");
                }
                System.out.println();
            }
            int c = random.nextInt(x - 1);
            int d = random.nextInt(y - 1);
            int[][] mass2 = new int[x - 1][y - 1];
            for (int i = 0, e = 0; i < x - 1; e++) {
                if (e != c) {
                    System.out.print("Номер строки массива, у которого удалена 1 строка и 1 столбец: " + i + " | ");
                    for (int j = 0, f = 0; j < y - 1; f++) {
                        if (f != d) {
                            mass2[i][j] = mass1[e][f];
                            System.out.print(mass2[i][j] + " ");
                            j++;
                        }
                    }
                    i++;
                }
                System.out.println();
            }
        }
    }