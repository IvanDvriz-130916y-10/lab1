package ËÐ6;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {

        int [] ints = new int [7];
        ints[0] = 10;
        ints[1] = 22;
        ints[2] = 36;
        ints[3] = 48;
        ints[4] = 51;

        int [] arrayIntResult1 = Example6.getArray(ints,3);
        System.out.println(Arrays.toString(arrayIntResult1));

        int [] arrayIntResult2 = Example6.getArray(ints,5);
        System.out.println(Arrays.toString(arrayIntResult2));
    }
    public static int[] getArray(int [] arrrayInt, int value) {
        if (value >= arrrayInt.length) {
            return  arrrayInt;
        }
        int [] arrayIntResult = new int[value];
        for (int i = 0; i < value; i++) {
            arrayIntResult[i] = arrrayInt[i];
        }
        return arrayIntResult;
    }
}
