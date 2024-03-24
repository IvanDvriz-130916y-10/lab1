package ��13.Example2;

    import java.util.Scanner;

    public class Example3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size;
            byte sum = 0;

            System.out.print("������� ������ �������: ");
            size = scanner.nextInt();

            byte[] array = new byte[size];

            for (int i = 0; i < size; i++) {
                try {
                    System.out.print("������� ������� �������: ");
                    array[i] = Byte.parseByte(scanner.next());

                    sum += array[i];
                } catch (NumberFormatException e) {
                    System.out.println("������: ������� �����!");
                    i--; // ��������� ���� ��� ����� ��������
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("������: ������� �������� �� ��������� ��������� ���� byte!");
                    i--; // ��������� ���� ��� ����� ��������
                }
            }

            System.out.println("����� ��������� �������: " + sum);
        }
    }
