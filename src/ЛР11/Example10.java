package ЛР11;

//	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//        содержащий только те числа, которые меньше заданного значения.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальное значение: ");
        int maxValue = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(8);
        numbers.add(22);
        numbers.add(10);
        numbers.add(911);

        List<Integer> filteredN = filterNumbersLessThanValue(numbers, maxValue);

        for (int num : filteredN) {
            System.out.println(num);
        }
    }
    public static List<Integer> filterNumbersLessThanValue(List<Integer> numbers, int maxValue) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num < maxValue) {
                filteredNumbers.add(num);
            }
        }
        return filteredNumbers;
    }
}