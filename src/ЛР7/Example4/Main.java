package ЛР7.Example4;

public class Main {
    public static void main(String[] args) {
        // Создание объекта FinalClass с параметрами
        FinalClass obj1 = new FinalClass('N', "Text", 789);

        // Создание копии объекта FinalClass
        FinalClass obj2 = new FinalClass(obj1);

        // Вывод значений полей для объекта obj1
        System.out.println("Значение поля symbol: " + obj1.symbol);
        System.out.println("Значение поля text: " + obj1.text);
        System.out.println("Значение поля number: " + obj1.number);

        // Вывод значений полей для объекта obj2 (копии)
        System.out.println("Значение поля symbol (копии): " + obj2.symbol);
        System.out.println("Значение поля text (копии): " + obj2.text);
        System.out.println("Значение поля number (копии): " + obj2.number);
    }
}