package ��13.Example1;

public class Primer6 {
    public static void main(String [] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("������");
        } catch (RuntimeException e) {
            System.out.println("3"); // ���� catch ��� RuntimeException
        } catch (Exception e) {
            System.out.println("2"); // ���� catch ��� Exception
        }
        System.out.println("4");
    }
}
