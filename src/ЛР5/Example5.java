package ��5;

public class Example5 {


    public static void main(String[] args) {

        Main5 example = new Main5(10);

        System.out.println("�����: " + example.PrInt());
        example.s(20);

        System.out.println("�����: " + example.PrInt());
        example.s(101);

        System.out.println("�����: " + example.PrInt());
        example.s(-5);

        System.out.println("�����: " + example.PrInt());
        example.s();
    }

    public static class Main5 {
            private int n;

            public void s(int x) {
                System.out.println("����� � ����������");
                n = x;

                if (x >= 10) {
                    n = 10;
                }
                if (x <= 0) {
                    n = 0;
                }
            }

            public void s() {
                System.out.println("����� ��� ��������� ");
                n = 0;
            }

            public int PrInt() {
                return n;
            }

            Main5(int int1) {
                System.out.println("�����������");
                {
                    this.s(int1);
                }
            }
        }
}
