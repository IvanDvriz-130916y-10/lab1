package ЛР6;
public class Example2 {
    public static void main(String[] args) {
            Main2.intIncrement();
        System.out.println();
        }
    public static class Main2 {
        private static int Int = 0;
         static void intIncrement() {
             System.out.println("Значение статического поля = " + Int);
            for (int i =0; i < 10; i++) {
                Int++;
                System.out.println("Значение статического поля = " + Int);
            }
        }
    }
}
