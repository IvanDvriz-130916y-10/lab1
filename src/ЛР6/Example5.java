package ËÐ6;

public class Example5 {
    public static void main(String[] args) {
            Main5 example5 = new Main5();
            int n = example5.sumOfSquares(5);
        System.out.println(n);
    }
    static class Main5 {
         int sumOfSquares (int n) {
            if (n <= 1)
                return n;
            else
                return sumOfSquares(n-1) + n * n;
        }
    }
}
