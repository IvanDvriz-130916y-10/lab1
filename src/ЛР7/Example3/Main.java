package ЛР7.Example3;
public class Main {
    public static void main(String[] args) {
        // Создаем объекты для каждого класса
        SuperClass superClassObj = new SuperClass(5);
        SubClass1 subClass1Obj = new SubClass1(25, 'A');
        SubClass2 subClass2Obj = new SubClass2(60, 'B', " Hello, What? ");

        // Выводим информацию о каждом объекте
        System.out.println(superClassObj.toString());
        System.out.println(subClass1Obj.toString());
        System.out.println(subClass2Obj.toString());
    }
}