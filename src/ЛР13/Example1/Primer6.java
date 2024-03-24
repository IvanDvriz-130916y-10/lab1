package ЛР13.Example1;

public class Primer6 {
    public static void main(String [] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (RuntimeException e) {
            System.out.println("3"); // блок catch для RuntimeException
        } catch (Exception e) {
            System.out.println("2"); // блок catch для Exception
        }
        System.out.println("4");
    }
}
