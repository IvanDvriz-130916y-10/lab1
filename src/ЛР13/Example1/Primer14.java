package ��13.Example1;

public class Primer14 {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("������ �������:  " + l);

            if (l != 0) {
                m(l);
            } else {
                System.out.println("������: ����� ������� ����� ����");
            }
        } catch (ArithmeticException e) {
            System.out.println("������: ������� �� ����");
        }
    }
}

