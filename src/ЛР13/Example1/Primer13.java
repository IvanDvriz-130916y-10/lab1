package ��13.Example1;

public class Primer13 {
    public static class Main { // ���������� Main �� static
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("������ ������� = " + l);

                if (l != 0) {
                    int h = 10 / l; // �������� �� ������������� �������
                    args[l - 1] = "10"; // �������� ������ �� l - 1
                }
            } catch (ArithmeticException e) {
                System.out.println("������� �� ����");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("������ �� ����������");
            }
        }
    }
}
