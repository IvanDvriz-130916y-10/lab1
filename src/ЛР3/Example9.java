package ЛР3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = id.nextInt();
        System.out.println("Размер массива равен: " + size);
        int [] nums = new int[size];
        Random random = new Random();

        for (int i=0; i<nums.length; i++) {
                nums[i] =random.nextInt(100);
            System.out.println("Элемент массива ["+i+"] = " + nums[i] );
        }
        Arrays.sort(nums);
        System.out.println("Произведене сортировка массива");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
    }
}
