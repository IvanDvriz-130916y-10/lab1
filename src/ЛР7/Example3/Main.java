package ��7.Example3;
public class Main {
    public static void main(String[] args) {
        // ������� ������� ��� ������� ������
        SuperClass superClassObj = new SuperClass(5);
        SubClass1 subClass1Obj = new SubClass1(25, 'A');
        SubClass2 subClass2Obj = new SubClass2(60, 'B', " Hello, What? ");

        // ������� ���������� � ������ �������
        System.out.println(superClassObj.toString());
        System.out.println(subClass1Obj.toString());
        System.out.println(subClass2Obj.toString());
    }
}