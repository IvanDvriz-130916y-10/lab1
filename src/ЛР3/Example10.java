package ЛР3;

import java.util.*;
public class Example10 {
    public static void main(String[] args) {
            Integer [] arr = new Integer[10];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
                System.out.println("Элемент массива: " + arr[i]);
            }
        Arrays.sort(arr, Collections.reverseOrder());
            for (int resalt : arr) {
                System.out.println("Сортировка массива: " + resalt);
            }
            }
        }



