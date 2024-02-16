package ЛР7.Example1;
// Класс Main
public class Main {
    public static void main(String[] args) {
        // Создание объекта класса SuperClassTest
        SuperClassTest superClassObject = new SuperClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        // Создание объекта класса SubClassTest с одним текстовым аргументом
        SubClassTest subClassObject1 = new SubClassTest("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        // Создание объекта класса SubClassTest с двумя текстовыми аргументами
        SubClassTest subClassObject2 = new SubClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
