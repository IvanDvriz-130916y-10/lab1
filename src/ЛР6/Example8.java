package ЛР6;

public class Example8 {
    public static void main(String[] args) {

            int n [] = {10,12,56,32,78};

            double avg = 0;

            if (n.length > 0) {
                double sum = 0;
                for (int i = 0; i <n.length; i++) {
                    sum += n[i];
                }
                avg = sum / n.length;
            }
        System.out.println("Среднее значение массива = " + avg);
        }
    }

