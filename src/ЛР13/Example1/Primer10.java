package ��13.Example1;

public class Primer10 {
    public class Main {
        public int m() {
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                // return 20; // ����� �� ���������� �������� �� ����� finally
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Primer10().new Main(); // ������� ��������� ���������� ������ Main
        System.out.println(main.m());
    }
}
