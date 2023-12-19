package ËĞ5;

public class Example4 {
    public static void main(String[] args) {
        Main4 Exampl4 = new Main4(12,'A');
        Main4 Exampl4_1 = new Main4(65.1267);
    }

    public static class Main4 {
        public char chars;
        public int ints;

        public Main4(int i, char j) {
            ints = i;
            chars = j;
            int len = (int) (Math.log10(ints) + 1);
            double d = (double) chars + (double) ints * 1 / Math.pow(10 , len);
            System.out.println("d = " +  d + "\n" + "chars = " + (double)chars + "\n" + "ints = " + len);
        }
        public Main4(double b) {
            char chars = (char) b;
            ints = (int) ((b - (int)b)*100);
            System.out.println(chars);
            System.out.println(ints);
        }
    }
}
