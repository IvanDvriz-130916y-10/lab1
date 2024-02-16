package ЛР7.Example5;

    public class Main {
        public static void main(String[] args) {
            // Создание объекта SubClass1
            SubClass1 object1 = new SubClass1("Текстовое поле", 123);
            // Вызов метода display для объекта SubClass1
            object1.display();

            // Создание объекта SubClass2
            SubClass2 object2 = new SubClass2("Другой текст", 'A');
            // Вызов метода display для объекта SubClass2
            object2.display();

            // Объектная переменная суперкласса, которая ссылается на объект производного класса
            SuperClass object3 = new SubClass1("Наследование", 456);
            // Вызов метода display через объектную переменную суперкласса
            object3.display();
        }
    }

