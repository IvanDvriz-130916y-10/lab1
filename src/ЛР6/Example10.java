package ËÐ6;

import java.util.Arrays;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        int [] arrayInt = getMaxAndMinMaxVould (12,53,46,5,20);
        System.out.println(Arrays.toString(arrayInt));
    }
    public static int []  getMaxAndMinMaxVould (int ... v) {
        Arrays.sort(v);
        int [] arrayInt = new int[2];

        arrayInt[0] = v [0];
        arrayInt[1] = v [v.length -1];

        return arrayInt;
    }
}
