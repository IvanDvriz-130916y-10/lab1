package ��7.Example1;
// ����� Main
public class Main {
    public static void main(String[] args) {
        // �������� ������� ������ SuperClassTest
        SuperClassTest superClassObject = new SuperClassTest("������� � ����������� �����������");
        String className = superClassObject.toString();
        System.out.println(className);

        // �������� ������� ������ SubClassTest � ����� ��������� ����������
        SubClassTest subClassObject1 = new SubClassTest("������� � ����������� ���������");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        // �������� ������� ������ SubClassTest � ����� ���������� �����������
        SubClassTest subClassObject2 = new SubClassTest("������� � ����������� ���������", "��� ��� ���������");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
