package ��13.Example1;

public class Primer4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("������");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
