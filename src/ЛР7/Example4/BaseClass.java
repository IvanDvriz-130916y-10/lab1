package ЛР7.Example4;

class BaseClass {
    protected char symbol; // символьное поле

    // Конструктор для создания объекта на основе значения поля
    BaseClass(char symbol) {
        this.symbol = symbol;
    }

    // Конструктор создания копии объекта
    BaseClass(BaseClass original) {
        this.symbol = original.symbol;
    }
}