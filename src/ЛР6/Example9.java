package ЛР6;

public class Example9 {
    public static void main(String[] args) {
        char [] arr = {'h','e','l','l','o'};
        System.out.println("Массив = ");
        Sort(arr);
    }
    static void Sort (char [] arr) {
        for (int i =0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int n = arr.length;
        char ars;
        for (int i =0; i < n/2; i++) {
            ars = arr [n - i -1];
            arr [n - i -1] = arr[i];
            arr[i] = ars;
        }
        System.out.println("Меняем местами: ");
        for (int i =0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
